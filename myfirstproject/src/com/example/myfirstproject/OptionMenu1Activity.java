package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionMenu1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_option_menu1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.option_menu1, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch(item.getItemId()){
		case R.id.menucontactus:
			Toast.makeText(getApplicationContext(), "contact selected",Toast.LENGTH_LONG).show();
			return true;
		case R.id.menugalary:
			Toast.makeText(getApplicationContext(), "galary selected",Toast.LENGTH_LONG).show();
			return true;
		case R.id.menuhome:
			Toast.makeText(getApplicationContext(), "home selected",Toast.LENGTH_LONG).show();
			return true;
		case R.id.menumail:
			Toast.makeText(getApplicationContext(), "mail selected",Toast.LENGTH_LONG).show();
			return true;
		case R.id.menusearch:
			Toast.makeText(getApplicationContext(), "search selected",Toast.LENGTH_LONG).show();
			return true;
			default:
				return super.onOptionsItemSelected(item);
				
		}
	}


}
