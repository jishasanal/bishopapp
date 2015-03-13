package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.view.View.OnTouchListener;
import android.view.MotionEvent;
//import android.widget.RelativeLayout;
import android.view.View;
//import android.view.ViewGroup.LayoutParams;
//import android.view.ViewGroup;

public class Ontouch1 extends Activity {
	
	
 ImageView imgview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ontouch1);
		imgview=(ImageView) findViewById(R.id.imgview);
		imgview.setOnTouchListener(new OnTouchListener()
		{
			public boolean onTouch(View v,MotionEvent event)
			{
				if(event.getAction()==MotionEvent.ACTION_MOVE)
			{
					RelativeLayout.LayoutParams mparam=( RelativeLayout.LayoutParams)imgview.getLayoutParams();
					int x=(int) event.getRawX();
					int y=(int) event.getRawY();
					mparam.leftMargin=x-100;
					mparam.topMargin=y-300;
					imgview.setLayoutParams(mparam);
			}
				return true;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ontouch1, menu);
		return true;
	}

}
