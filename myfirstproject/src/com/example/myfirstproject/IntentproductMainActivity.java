package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import java.util.ArrayList;
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.SQLException;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class IntentproductMainActivity extends Activity {
	
	       

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intentproduct_main);
		
		 ListView listview;
	        listview=(ListView) findViewById(R.id.dblist1);
		
		ArrayAdapter<String> listAdapter;
		Database dbHandler=new Database(this,null,null,1);
		ArrayList<String> hm=new ArrayList<String>();
		hm=dbHandler.selectAll();
		Log.e("retive","intent");
		listAdapter=new ArrayAdapter<String>(this,R.layout.listview,hm);
		
		
		listview.setAdapter(listAdapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.intentproduct_main, menu);
		return true;
	}

}

