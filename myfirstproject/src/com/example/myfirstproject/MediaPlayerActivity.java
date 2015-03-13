package com.example.myfirstproject;

import java.util.concurrent.TimeUnit;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MediaPlayerActivity extends Activity {

	public TextView songname,startTimeField,endTimeField;
	private MediaPlayer mediaplayer;
	private double starttime=0;
	private double finaltime=0;
	private Handler myhandler=new Handler();
	private int forwardTime=5000;
	private int backwardTime=5000;
	private SeekBar seekbar1;
	private ImageButton playbutton,pausebutton;
	public static int oneTimeOnly=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_media_player);
		
		songname=(TextView) findViewById(R.id.txtsong1);
		startTimeField=(TextView) findViewById(R.id.starttime);
		endTimeField=(TextView) findViewById(R.id.endtime);
		seekbar1=(SeekBar)findViewById(R.id.seek);
		playbutton=(ImageButton) findViewById(R.id.play);
		pausebutton=(ImageButton)findViewById(R.id.pause);
		songname.setText("song Mp3");
		mediaplayer=MediaPlayer.create(this, R.raw.songs);
		seekbar1.setClickable(false);
		pausebutton.setEnabled(false);
		
	}

	
	public void play(View view)
	{
		mediaplayer.start();
		finaltime=mediaplayer.getDuration();
		starttime=mediaplayer.getCurrentPosition();
		if(oneTimeOnly==0)
		{
			seekbar1.setMax((int) finaltime);
			oneTimeOnly=1;
		}
		
		endTimeField.setText(String.format("%d min,%d sec", TimeUnit.MILLISECONDS.toMinutes((long)finaltime),
				  TimeUnit.MILLISECONDS.toSeconds((long)finaltime),
				  TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)finaltime))));
		
		startTimeField.setText(String.format("%d min,%d sec", TimeUnit.MILLISECONDS.toMinutes((long)starttime),
                TimeUnit.MILLISECONDS.toSeconds((long)starttime),
                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)starttime))));
		
		seekbar1.setProgress((int)starttime);
		myhandler.postDelayed(UpdateSongTime,100);
		pausebutton.setEnabled(true);
		playbutton.setEnabled(false);
		
	}
	private Runnable UpdateSongTime=new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			starttime=mediaplayer.getCurrentPosition();
			startTimeField.setText(String.format("%d min,%d sec", TimeUnit.MILLISECONDS.toMinutes((long)starttime),
	                TimeUnit.MILLISECONDS.toSeconds((long)starttime),
	                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes((long)starttime))));
			seekbar1.setProgress((int)starttime);
			myhandler.postDelayed(this,100);
		}
	};
	public void pause(View v){
		mediaplayer.pause();
		pausebutton.setEnabled(false);
		playbutton.setEnabled(true);
	}
	public void forward(View v){
		int temp=(int) starttime;
		if((temp+forwardTime)<=finaltime)
		{
			starttime=starttime+forwardTime;
			mediaplayer.seekTo((int) starttime);
		}
		else
		{
			Toast.makeText(getApplicationContext(),"cannt jump fw 5 seconds",Toast.LENGTH_LONG).show();
		}
	}
	public void rewind(View v){
		int temp=(int) starttime;
		if((temp-backwardTime)<=backwardTime)
		{
			starttime=starttime-backwardTime;
			mediaplayer.seekTo((int) starttime);
		}
		else
		{
			Toast.makeText(getApplicationContext(),"cannt jump fw 5 seconds",Toast.LENGTH_LONG).show();
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.media_player, menu);
		return true;
	}

}
