package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import  android.content.Intent;

import android.widget.Button;


public class ServicesExample extends Activity implements OnClickListener {
	
	Button start,stop,next;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_services_example);
		start=(Button) findViewById(R.id.btnStart);
		stop=(Button) findViewById(R.id.btnStop);
		next=(Button) findViewById(R.id.btnnext);
		
		start.setOnClickListener(this);
		stop.setOnClickListener(this);
		next.setOnClickListener(this);
	}
	public void onClick(View src)
	{
		switch(src.getId())
		{
		case R.id.btnStart:
			startService(new Intent(this,MyServices.class));
			break;
		case R.id.btnStop:
			stopService(new Intent(this,MyServices.class));
			break;
		case R.id.btnnext:
			Intent intent=new Intent(this,Table.class);
			startActivity(intent);
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.services_example, menu);
		return true;
	}

}
