package com.example.myfirstproject;

import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

public class HandleJsonXML {
	private String country="country";
	private String temperature="temperature";
	private String time="time";
	private String urlstring=null;
	
	public volatile boolean parsingCompleted=true;
	public boolean parsingComplete;
	public HandleJsonXML(String url){
		this.urlstring=url;
	}
	public String getCountry()
	{
		return country;
	}
	public String getTime()
	{
		return time;
	}
	public String getTemperature()
	{
		return temperature;
	}
	public void readAndparseJSON(String in)
	{
		try{
			JSONObject reader=new JSONObject(in);
			JSONObject sys=reader.getJSONObject("sys");
			country= sys.getString("country");
			
			JSONObject main=reader.getJSONObject("main");
			temperature= main.getString("temperature");
			
			time=main.getString("time");
			boolean parsingComplete = false;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void fetchJSON()
	{
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			try{
				URL url=new URL(urlstring);
				HttpURLConnection conn=(HttpURLConnection) url.openConnection();
				conn.setReadTimeout(1000);
				conn.setConnectTimeout(15000);
				conn.setRequestMethod("GET");
				conn.setDoInput(true);
				conn.connect();
				InputStream stream=conn.getInputStream();
				String data=convertStreamToString(stream);
				readAndparseJSON(data);
				stream.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			}
			
		});
		thread.start();
	}
	static String convertStreamToString(java.io.InputStream is){
		java.util.Scanner s=new java.util.Scanner(is).useDelimiter("\\A");
		return s.hasNext()?s.next():"";
	}

}
