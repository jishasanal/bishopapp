package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.view.View;
//import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class ToastTest extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_toast);
		
		TextView txt=(TextView)findViewById(R.id.txttoast);
		final String label=txt.getText().toString();
		txt.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v)
			{
        	Toast.makeText(getApplicationContext(),"You have Clicked the Label"+label,Toast.LENGTH_LONG).show();	
			}});
			
			
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.toast, menu);
		return true;
	}

}

//@Override
//public void onClick(View arg0) {
	// TODO Auto-generated method stub
	
//}
	
