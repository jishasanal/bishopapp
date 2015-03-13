package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.SlidingDrawer;
import android.widget.SlidingDrawer.OnDrawerOpenListener;
import android.widget.SlidingDrawer.OnDrawerCloseListener;
import android.widget.Button;
import android.widget.SlidingDrawer;
import android.widget.TextView;

public class SliddingdrawerActivity extends Activity {
	Button handle,click;
	TextView text;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sliddingdrawer);
		
		Context context = this.getApplicationContext();
		handle=(Button) findViewById(R.id.handle);
		text=(TextView) findViewById(R.id.text1);
		click=(Button) findViewById(R.id.clickme);
		SlidingDrawer drawer = (SlidingDrawer) findViewById(R.id.slidingDrawer1);
		
		drawer.setOnDrawerOpenListener(new OnDrawerOpenListener(){
		public void onDrawerOpened()
		{
			handle.setText("__");
			text.setText("already dragged");
			
		}
		});
		drawer.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				handle.setText("++");
				text.setText("for more info dragg button");
			}
		} );
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sliddingdrawer, menu);
		return true;
	}

}
