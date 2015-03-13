package com.example.myfirstproject;

import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.os.Handler;
import android.view.View;
//import android.view.View.OnClickListener;

import android.app.ProgressDialog;
public class Progressbar extends Activity {

	
	//Button btnp;
	ProgressBar progressbar;
	private int myprogress=0;
	private int status=0;
	private Handler progressbarhandle=new Handler();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_progressbar);
		
		
		
	}
	public void beginYourTask(View view)
	{
		myprogress=0;
		progressbar=(ProgressBar) findViewById(R.id.progressBar1);
		progressbar.setMax(100);
		new Thread(new Runnable()
		{
			public void run()
			{
				while(status<100)
				{
					status=performTask();
					progressbarhandle.post(new Runnable(){
						public void run()
						{
							progressbar.setProgress(status);
						}
						
					});
				}
				progressbarhandle.post(new Runnable(){
					public void run(){
						Toast.makeText(getApplicationContext(), "complited", Toast.LENGTH_LONG).show();
						status=0;
						myprogress=0;
					}
				});
					
				}
			private int performTask()
			{
				try
				{
					Thread.sleep(100);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				return ++myprogress;
			}
			
		}).start();
	}
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.progressbar, menu);
		return true;
	}

}
