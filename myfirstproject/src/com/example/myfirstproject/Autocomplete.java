package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

//import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Autocomplete extends Activity {
	
	AutoCompleteTextView autocompletetextview;
	String[] arr={ "my sql","my sql server","sql"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_autocomplete);
		
		//autocompletetextview=(AutoCompleteTextView) findViewById(R.id.atoCmplte);
		//ArrayAdapter adapter=new ArrayAdapter(this,R.layout.,arr);
		
		//autocompletetextview.setThreshold(1);
		//autocompletetextview.setAdapter(adapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.autocomplete, menu);
		return true;
	}

}
