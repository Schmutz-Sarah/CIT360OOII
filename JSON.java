import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.io.*;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class JSON {
	
	private static String url = "http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_day.geojson";
	public static void main(String[] args)throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse response1 = httpclient.execute(httpGet);
		System.out.println(response1.getStatusLine());
		HttpEntity entity1 = response1.getEntity();
		String jsonString = EntityUtils.toString(entity1);
		EntityUtils.consume(entity1);
		
		List<String> elephantList = Arrays.asList(jsonString.split("\""));
		List<String> elephantList2 = Arrays.asList(jsonString.split("title"));
		
		for (String s : elephantList) {
			System.out.println("type" + s);
			}
		
		for (String s : elephantList2) {
			List<String> elephantList3 = Arrays.asList(s.split("\""));
			//System.out.println("title" + s);
			
			for (String s2 : elephantList3) {
				//System.out.println("REAL" + s2);
				}
			}
		}
	}
