package com.example.myfirstproject;

import java.util.Stack;

import android.os.Bundle;
import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NotificationsActivity extends Activity {

	
	private NotificationManager notificationmnger;
	private int notificationId=100;
	private int numMessages=1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notifications);
		
		Button btnstart=(Button) findViewById(R.id.btnnotificstart);
		btnstart.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				displayNotification();
			}
		});
		Button btncancel=(Button) findViewById(R.id.btnnotificcancel);
		btncancel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				cancelNotification();
			}
		});
		Button btnupdate=(Button) findViewById(R.id.btnnotificupdate);
		btnupdate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				updateNotification();
			}
		});
	}
	protected void displayNotification() {
		
		NotificationCompat.Builder mbuilder=new NotificationCompat.Builder(this);
		mbuilder.setContentTitle("New Message");
		mbuilder.setContentText("You have received one new message");
		
		mbuilder.setTicker("New Message Alert");
		mbuilder.setSmallIcon(R.drawable.ic_jisha);
		mbuilder.setNumber(++numMessages);
		Intent resultintent=new Intent(this,NotificationView.class);
		
		TaskStackBuilder stackbuilder=TaskStackBuilder.create(this);
		stackbuilder.addParentStack(NotificationView.class);
		stackbuilder.addNextIntent(resultintent);
		PendingIntent resultpendingIntent=stackbuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
		
		mbuilder.setContentIntent(resultpendingIntent);
		notificationmnger=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		notificationmnger.notify(notificationId,mbuilder.build());
		
		
	}
	protected void cancelNotification()
	{
		notificationmnger.cancel(notificationId);
	}

	protected void updateNotification()
	{
		NotificationCompat.Builder mbuilder=new NotificationCompat.Builder(this);
		mbuilder.setContentTitle("Update Message");
		mbuilder.setContentText("You have got updated message");
		
		mbuilder.setTicker("Update Message Alert");
		mbuilder.setSmallIcon(R.drawable.ic_jisha);
		
		mbuilder.setNumber(++numMessages);
		
		Intent resultintent=new Intent(this,NotificationView.class);
		
		TaskStackBuilder stackbuilder=TaskStackBuilder.create(this);
		stackbuilder.addParentStack(NotificationView.class);
		
		stackbuilder.addNextIntent(resultintent);
		PendingIntent resultpendingIntent=stackbuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
		
		mbuilder.setContentIntent(resultpendingIntent);
		notificationmnger=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		notificationmnger.notify(notificationId,mbuilder.build());
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.notifications, menu);
		return true;
	}

}
