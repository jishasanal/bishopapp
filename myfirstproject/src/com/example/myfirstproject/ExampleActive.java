package com.example.myfirstproject;

import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;
import android.util.Log;

public class ExampleActive extends Activity {

	String msg="Android";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_example_active);
		Log.d(msg,"The onCreate() event");
	}
	@Override
	protected void onStart()
	{
		super.onStart();
		Log.d(msg,"the onStart() event");
		
	}	@Override
	protected void onResume()
	{
		super.onResume();
		Log.d(msg,"the onResume() event");
		
	}
	protected void onPause()
	{
		super.onPause();
		Log.d(msg,"the onPause() event");
		
	}
	protected void onStop()
	{
		super.onStop();
		Log.d(msg,"the onStop() event");
		
	}
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.example_active, menu);
		return true;
	}

}
