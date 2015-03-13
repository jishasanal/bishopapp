package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class BroadcastIntentActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_broadcast_intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.broadcast_intent, menu);
		return true;
	}
	public void CustomBroadcastIntent(View view)
	{
		Intent intent=new Intent();
		intent.setAction("com.jisha.CUSTOM_INTENT");
		sendBroadcast(intent);
	}

}
