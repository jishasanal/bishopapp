package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class JSonParserActivity extends Activity {
	private String url1="http://api.openweathermap./org/data/2.5//weather?q=";
	EditText loc,con,temp,time;
	private HandleJsonXML obj;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_json_parser);
		
		loc=(EditText) findViewById(R.id.edtloc);
		con=(EditText) findViewById(R.id.edtcon);
		temp=(EditText) findViewById(R.id.edtTemp);
		time=(EditText) findViewById(R.id.edtTime);
		
	}
	public void open(View view){
		String url=loc.getText().toString();
		String finalurl=url1+url;
		con.setText(finalurl);
		obj=new HandleJsonXML(finalurl);
		obj.fetchJSON();
		while(obj.parsingComplete);
		con.setText(obj.getCountry());
		temp.setText(obj.getTemperature());
		time.setText(obj.getTime());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.json_parser, menu);
		return true;
	}

}
