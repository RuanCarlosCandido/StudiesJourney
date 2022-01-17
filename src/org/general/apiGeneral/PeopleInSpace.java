package org.general.apiGeneral;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import org.general.db.MyConnection;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Class that establish a simple API connection, consume it and sabe the
 * response on a local database. Its expected to show people in Space right now
 * 
 * @author Ruan
 */
public class PeopleInSpace {
	private static HttpURLConnection connection;

	private static final String API_URL = "http://api.open-notify.org/astros.json";

	public static void main(String[] args) throws Exception {

		String apiResponseline = "";
		StringBuffer responseContent = new StringBuffer();
		try {
			connection = configureConnection("GET");

			if (connection.getResponseCode() != HttpURLConnection.HTTP_OK)

				responseContent = getErrorContent(apiResponseline, responseContent);

			else {

				responseContent = getContent(apiResponseline, responseContent);

				List<JSONObject> astronauts = deserialize(responseContent);

				astronauts.forEach(jso -> save(new Astronaut(jso)));
			}
		} catch (Exception e) {
			throw new Exception(e);
		}
		System.out.println(responseContent.toString());
	}

	@SuppressWarnings("unchecked")
	private static List<JSONObject> deserialize(StringBuffer responseContent) throws ParseException {
		JSONParser jparser = new JSONParser();

		HashMap<String, Object> map = (HashMap<String, Object>) jparser.parse(responseContent.toString());

		return (List<JSONObject>) jparser.parse(map.get("people").toString());
	}

	private static StringBuffer getContent(String apiResponseline, StringBuffer responseContent) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {

			if (!reader.ready())
				throw new IOException("No response from API");

			while (reader.ready()) {
				apiResponseline = reader.readLine();
				responseContent.append(apiResponseline + "\n");
			}

		} catch (IOException e) {
			throw new IOException(e);
		}
		return responseContent;
	}

	private static StringBuffer getErrorContent(String apiResponseline, StringBuffer responseContent) throws Exception {

		System.out.println(connection.getResponseCode());
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()))) {

			if (!reader.ready())
				throw new Exception("No response from API");

			while (reader.ready()) {
				apiResponseline = reader.readLine();
				responseContent.append(apiResponseline + "\n");
			}
		} catch (IOException e) {
			throw new IOException(e);
		}
		return responseContent;
	}

	private static HttpURLConnection configureConnection(String requestMethod) throws IOException {
		URL url = new URL(API_URL);

		connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod(requestMethod);
		connection.setConnectTimeout(5000);
		connection.setReadTimeout(5000);

		return connection;
	}

	private static void save(Astronaut astronaut) {

		MyConnection.getSession().save(astronaut);

		MyConnection.getSession().beginTransaction().commit();
	}
}