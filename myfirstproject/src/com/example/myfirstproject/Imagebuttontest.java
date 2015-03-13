package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.view.View;
//import android.widget.Toast;

public class Imagebuttontest extends Activity {

	ImageButton btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_imagebuttontest);
		btn=(ImageButton)findViewById(R.id.imgbtn);
		addListenerOnButton();
	}
public void addListenerOnButton()
{
	btn.setOnClickListener(new OnClickListener()
	{
	public void onClick(View v)
	{
		Toast.makeText(getApplicationContext(), "clicked image button", Toast.LENGTH_LONG).show();
	}
	}		);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.imagebuttontest, menu);
		return true;
	}

}
