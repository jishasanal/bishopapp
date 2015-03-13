package com.example.myfirstproject;

import android.os.Bundle;
import android.app.TabActivity;
import android.view.Menu;

import android.content.Intent;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;



public class TabMainActivity extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab_main);
		
		TabHost tabhost=getTabHost();
		//****************************tab for photos/songs/videos*****************************//
		
		TabSpec photospec=tabhost.newTabSpec("Photos");
		TabSpec songspec=tabhost.newTabSpec("Songs");
		TabSpec vediospec=tabhost.newTabSpec("Vedios");
		
		//***************************set  title and icon for the tab*****************************8/
		photospec.setIndicator("Photos",getResources().getDrawable(R.drawable.img));
		Intent photosIntent=new Intent(this,PhotoTabMainActivity.class);
		photospec.setContent(photosIntent);
		
		//****************************tab for songs*****************************//
		
				
				songspec.setIndicator("Songs",getResources().getDrawable(R.drawable.img));
				Intent songIntent=new Intent(this,SongTabMainActivity.class);
				songspec.setContent(songIntent);
				
				//****************************tab for vedio*****************************//
				
				
				vediospec.setIndicator("vedio",getResources().getDrawable(R.drawable.img));
				Intent vedioIntent=new Intent(this,VedioTabMainActivity.class);
				vediospec.setContent(vedioIntent);
		
		//*********************adding all TabSpec to TabHost**************************//
				tabhost.addTab(photospec);
				tabhost.addTab(songspec);
				tabhost.addTab(vediospec);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tab_main, menu);
		return true;
	}

}
