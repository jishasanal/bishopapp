package com.example.myfirstproject;

import android.app.Service;
import android.content.Intent;

import android.os.IBinder;
import android.widget.Toast;

public class MyServices extends Service {
	@Override
	public IBinder onBind(Intent intent)
	{
		return null;
	}
	@Override
	public void onCreate()
	{
		Toast.makeText(this, "Service created", Toast.LENGTH_LONG).show();
	}
	@Override
	public void onStart(Intent intent,int startid)
	{
		Toast.makeText(this, "Service started", Toast.LENGTH_LONG).show();
	}
	@Override
	public void onDestroy()
	{
		super.onDestroy();
		Toast.makeText(this, "Service stoped", Toast.LENGTH_LONG).show();
	}



}
