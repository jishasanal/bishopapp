package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ProgressBar;
import android.view.View;

public class Thread1Activity extends Activity {

	private ProgressBar bar1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thread1);
		
		bar1=(ProgressBar) findViewById(R.id.bar);
		//bar1=(Progressbar) findViewById(R.id.bar);
	}
	    
		public void startProgress(View view)
		{
			bar1.setProgress(0);
			new Thread(new Task()).start();
			
		}

		class Task implements Runnable{
			public void run(){
			  for(int i=0;i<=10;i++)
			  {
				  final int value=i;
				  try{
					  Thread.sleep(1000);
				  }catch (InterruptedException e){
					  e.printStackTrace();
				  }
				  bar1.setProgress(value);
			  }
			
			}
			
			}
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.thread1, menu);
		return true;
	}

}
