package com.example.myfirstproject;

import java.util.ArrayList;

//import com.example.mywork.R;

//import com.example.mywork.R;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ContactMainActivity extends Activity {

	
	 ListView listview;
    
     
     String[] name={"Jisha","Sanal","Sajey","Sarith"};
     String[] number={"9876987765","9786756543","9876546372","9698746353"};
     Integer[] imageId={R.drawable.ic_jisha,R.drawable.ic_contact_image,R.drawable.ic_contact_photo,R.drawable.ic_photo};
     
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact_main);
		
	    CustomList customlist=new CustomList(ContactMainActivity.this,name,number,imageId);
	   
	    listview=(ListView) findViewById(R.id.contactlists);
	    Log.e("workingggg","list");
	    listview.setAdapter(customlist);
	    
		/*ArrayAdapter<String> listAdapter;
		Contact_db dbHandler=new Contact_db(this,null,null,1);
		ArrayList<String> hm=new ArrayList<String>();
		
		hm=dbHandler.selectAll();
		listAdapter=new ArrayAdapter<String>(this,R.layout.contactlistss,R.id.txtcontactname,hm);
		listview.setAdapter(listAdapter);*/
		
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contact_main, menu);
		return true;
	}

}
