package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
//import android.view.View.OnKeyListener;

public class EventHand2 extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event_hand2);
		Button sbtn=(Button) findViewById(R.id.smallbutton);
		Button lbtn=(Button) findViewById(R.id.largebutton);
		
		sbtn.setOnClickListener(this);
		lbtn.setOnClickListener(this);
		
	}
	
	public void onClick(View v)
	{
		if(v.getId()==R.id.smallbutton)
		{
			TextView txtview1=(TextView) findViewById(R.id.txtview1);
			txtview1.setTextSize(24);
		}
		else if(v.getId()==R.id.largebutton)
		{
			TextView txtview1=(TextView) findViewById(R.id.txtview1);
			txtview1.setTextSize(34);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event_hand2, menu);
		return true;
	}

}
