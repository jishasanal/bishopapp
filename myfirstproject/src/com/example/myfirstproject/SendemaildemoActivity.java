package com.example.myfirstproject;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.AndroidException;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class SendemaildemoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sendemaildemo);
		
		Button send=(Button) findViewById(R.id.send);
		send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sendEmail();
			}
		});
	}

	protected void sendEmail() {
		String to="jishapk87@GMAIL.COM";
		String cc="jishapk87@GMAIL.COM";
		Intent emailintent=new Intent(Intent.ACTION_SEND);
		
		emailintent.setData(Uri.parse("mailto:"));
		emailintent.setType("Text/plain");
		
		emailintent.putExtra(Intent.EXTRA_EMAIL,to);
		emailintent.putExtra(Intent.EXTRA_CC,cc);
		emailintent.putExtra(Intent.EXTRA_SUBJECT,"your subject");
		emailintent.putExtra(Intent.EXTRA_TEXT,"fghxfghxgfh");
		
		try
		{
			startActivity(Intent.createChooser(emailintent, "sending email..........."));
			finish();
		}
		catch(android.content.ActivityNotFoundException ex)
		{
			Toast.makeText(SendemaildemoActivity.this,"there is no email client installed", Toast.LENGTH_LONG).show();
		}
		
		
	} 
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sendemaildemo, menu);
		return true;
	}

}
