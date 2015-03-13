package com.example.myfirstproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Myreciever extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		
		Toast.makeText(context, "recieved", Toast.LENGTH_LONG).show();
	}
	

}
