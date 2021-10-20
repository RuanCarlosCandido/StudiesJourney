package org.general.apiGeneral;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class MaisTeste {
	private static HttpURLConnection connection;

	public static void main(String[] args) {

		BufferedReader reader;
		String line;
		StringBuffer responseContent = new StringBuffer();

		String json ="";
		
		try {
//			URL url = new URL("https://jsonplaceholder.typicode.com/users");
			 URL url = new URL("http://api.open-notify.org/astros.json");

			connection = (HttpURLConnection) url.openConnection();

			// Request Setup
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
//			connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
//			connection.setDoInput(true);
//			connection.setDoOutput(true);
//			
//			OutputStream os = connection.getOutputStream();
//			os.write(json.getBytes("UTF-8"));
//			os.close();
//			
//			InputStream is = new BufferedInputStream(connection.getInputStream());
//			
			Map<Integer,String> hm2 = new HashMap<Integer,String>();

			
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
int i = 1;
					responseContent.append(line + "\n");
					hm2.put(i, line);
				i++;
				}
				reader.close();

			}

			System.out.println(responseContent.toString());
Map<String,String> hm = new HashMap<String,String>();
			
hm.put("content", responseContent.toString());


		JSONObject jo = new JSONObject(hm2);	

		System.out.println("content" + jo.get(1));
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}

	}

}
