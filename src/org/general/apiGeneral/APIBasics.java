package org.general.apiGeneral;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.simple.JSONObject;

public class APIBasics {
	private static HttpURLConnection connection;

	public static void main(String[] args) {

		JSONObject js = new JSONObject();
		js.put("nome", "ruan");
		js.put("idade", 15);
		js.put("macho?", true);

		System.out.println(js);

		BufferedReader reader;
		String line;
		StringBuffer responseContent = new StringBuffer();

		try {
			// URL url = new URL("https://jsonplaceholder.typicode.com/users");
			URL url = new URL("http://api.open-notify.org/astros.json");

			connection = (HttpURLConnection) url.openConnection();

			// Request Setup
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);

			int status = connection.getResponseCode();
			System.out.println(status);

			if (status > 299) {
				reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));

				while ((line = reader.readLine()) != null) {

					responseContent.append(line);
				}
				reader.close();
			} else {
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

				while ((line = reader.readLine()) != null) {

					responseContent.append(line + "\n");
				}
				reader.close();

			}

			System.out.println(responseContent.toString());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}

	}

}