package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SongTabMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_song_tab_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.song_tab_main, menu);
		return true;
	}

}
