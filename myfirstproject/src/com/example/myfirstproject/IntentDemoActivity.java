package com.example.myfirstproject;

//import com.example.myfirstproject.R.id;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class IntentDemoActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intent_demo);
		
		setContentView(R.layout.activity_intent_demo);
		Button btnview=(Button) findViewById(R.id.btnview);
		Button btnlaunch=(Button) findViewById(R.id.btnlaunch);
		Button btnexcpt=(Button) findViewById(R.id.btnexcpt);
		 btnview.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(android.content.Intent.ACTION_VIEW,
						Uri.parse("http://www.example.com"));
				startActivity(i);
			}
		});
		 
		 btnlaunch.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent("com.example.Intentdemo.launch",
							Uri.parse("http://www.example.com"));
					startActivity(i);
				}
			});
		 
		 btnexcpt.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent("com.example.Intentdemo.launch",
							Uri.parse("http//www.example.com"));
					startActivity(i);
				}
			});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.intent_demo, menu);
		return true;
	}

}
