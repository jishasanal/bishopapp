package com.example.myfirstproject;

import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;
import android.app.AlertDialog;

public class Alertdialoge extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alertdialoge);
		AlertDialog alert=new AlertDialog.Builder(this).create();
		alert.setTitle("Title Testing");
		alert.setMessage("Testing Message");
		alert.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alertdialoge, menu);
		return true;
	}

}
