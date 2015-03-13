package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;
import android.widget.ArrayAdapter;
//import android.widget.AdapterView;
//import android.widget
//import android.widget.AdapterView.OnItemClickListener;

public class Listviews extends Activity {

	static final String[] countryarray=new String[]{"India","Pakistan","China","Australia"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listviews);
		
		
		
		ArrayAdapter <String> adapter=new ArrayAdapter <String>(this,R.layout.listview, countryarray);
		ListView listview=(ListView) findViewById(R.id.listView2);
		
		listview.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.listviews, menu);
		return true;
	}

}
