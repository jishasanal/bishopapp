package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.view.KeyEvent;
import android.view.View.OnLongClickListener;
import android.view.View.OnKeyListener;


//import android.view.View.OnClickListener;

public class Eventhand3 extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eventhand3);
	}
		public void dosmall(View v)
		{
			
			TextView txtview=(TextView) findViewById(R.id.textView1);
			txtview.setTextSize(24);
//*****************************************ON KEY LISTENER*******************************
			
			
			txtview.setOnKeyListener(new OnKeyListener()
			{
				public boolean onKey (View v, int keycode, KeyEvent event)
				{
					if(keycode==KeyEvent.KEYCODE_ENTER)
					{
					//	makeToast(keycode+"key pressed"); event.getAction()==KeyEvent.ACTION_DOWN && 
					Toast.makeText(getApplicationContext(), keycode+"You pressed", Toast.LENGTH_SHORT).show();
					return true;
					}
					return false;
				}
				
			});
//*****************************************ON LONG CLICK LISTENER*******************************
			txtview.setOnLongClickListener(new OnLongClickListener ()
			{
				public boolean onLongClick(View v)
				{
					
					Toast.makeText(getApplicationContext(), "You clicked", Toast.LENGTH_SHORT).show();
					return false;
					
				}
			});
			
			return;
		}
		public void dolarge(View v)
		{
			TextView txtview=(TextView) findViewById(R.id.textView1);
			txtview.setTextSize(34);
			return;
		}
		
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.eventhand3, menu);
		return true;
	}

}
