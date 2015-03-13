package com.example.myfirstproject;

import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ScrollfoodList extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scrollfood_list);
		
		String[] food=new String[] {"Pizza","Burger","KFC","Mc","Subway","Kabab","Donat","Biriyani","Chiken65","Chillichiken","thandoori","Naan","Chiken Roast","Pizza","Burger","KFC","Mc","Subway","Kabab","Donat","Biriyani","Chiken65","Chillichiken"};
		ArrayAdapter<String> items=new ArrayAdapter<String>(this,R.layout.scrollist,food);
		ListView ls=(ListView) findViewById(R.id.lstfood);
		ls.setAdapter(items);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.scrollfood_list, menu);
		return true;
	}

}
