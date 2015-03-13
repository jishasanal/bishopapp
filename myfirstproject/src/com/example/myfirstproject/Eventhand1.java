package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View;

public class Eventhand1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eventhand1);
		final Button btn1=(Button) findViewById(R.id.smallbtn);
		final Button btn2=(Button) findViewById(R.id.largebtn);
		
		btn1.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				TextView txtview=(TextView) findViewById(R.id.txtHallo);
				txtview.setTextSize(25);
			}
		
		    
		});
		//*****************************************ON KEY LISTENER*******************************
		
		TextView textview=(TextView) findViewById(R.id.textView1);
		textview.setOnKeyListener(new OnKeyListener()
		{@Override
			public boolean onKey (View v, int keycode, KeyEvent event)
			{
				if((event.getAction()==KeyEvent.ACTION_DOWN)&&(keycode==KeyEvent.KEYCODE_ENTER))
				{
				//	makeToast(keycode+"key pressed"); event.getAction()==KeyEvent.ACTION_DOWN && 
				Toast.makeText(Eventhand1.this, keycode+"You pressed", Toast.LENGTH_LONG).show();
				
				}
				return false;
			}
			
		});
		
		
		
		btn2.setOnFocusChangeListener(new OnFocusChangeListener()
		{ 
			@Override
			public void onFocusChange(View v,boolean hasFocus)
			{
				if(hasFocus)
				{
					Toast.makeText(getApplicationContext(),"color changed", Toast.LENGTH_SHORT).show();
				    btn2.setBackgroundColor(Color.rgb(253, 240, 166));	
			    }
			}
		});
		/*btn2.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				TextView txtview=(TextView) findViewById(R.id.txtHallo);
				txtview.setTextSize(40);
				
			}
		});*/
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.eventhand1, menu);
		return true;
	}

}
