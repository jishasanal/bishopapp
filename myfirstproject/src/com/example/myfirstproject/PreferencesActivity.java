package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class PreferencesActivity extends Activity {
	
	
	TextView txtname;
	TextView txtphone;
	public static final String MyPREFERENCES="myprefs";
	public static final String Name="nameKey";
	public static final String phone="phoneKey";
	SharedPreferences sharedpre;
	private SharedPreferences.Editor editor;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_preferences);
		txtname=(TextView)findViewById(R.id.txtprename);
		txtphone=(TextView) findViewById(R.id.txtprephone);
		 sharedpre=getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
		 
		 if(sharedpre.contains(Name))
		 {
			 txtname.setText(sharedpre.getString(Name, ""));
			 
		 }
		 if(sharedpre.contains(phone))
		 {
			 txtphone.setText(sharedpre.getString(phone, ""));
			 
		 }
		
	}
	public void run(View view)
	{
		String n=txtname.getText().toString();
		String ph=txtphone.getText().toString();
		//Bundle editor;
		editor.putString(Name, n);
		editor.putString(phone, ph);
		//editor.clear();
		editor.commit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) { 
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.preferences, menu);
		return true;
	}

}
