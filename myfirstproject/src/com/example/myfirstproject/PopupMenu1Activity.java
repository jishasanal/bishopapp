package com.example.myfirstproject;

import java.util.zip.Inflater;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.EditText;
//import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class PopupMenu1Activity extends Activity {
	
	EditText edtpop;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_popup_menu);
		edtpop=(EditText) findViewById(R.id.edtpopup);
		edtpop.setOnCreateContextMenuListener(this);
		registerForContextMenu(edtpop);
		
		
		/*menutxt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			PopupMenu popup=new PopupMenu(PopupMenu1Activity.this, menutxt);
			popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());
			popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
					
					@Override
					public boolean onMenuItemClick(MenuItem item) {
						// TODO Auto-generated method stub
						
						Toast.makeText(PopupMenu1Activity.this, "you clicked" + item.getTitle(),Toast.LENGTH_LONG).show();
						return true;
					}
				});
				popup.show();
			}
		});*/
	}
	
	

	/*	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.popup_menu, menu);
		return true;
	}*/
	public void onCreateContextMenu(ContextMenu m, View v, ContextMenuInfo i) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		//openContextMenu(v);
		
		super.onCreateContextMenu(m, v,i);
		Log.e("Context", "context");
		getMenuInflater().inflate(R.menu.popupmenu1, m);
		Log.e("Context", "context");
		//MenuInflater inflater=getMenuInflater();
		//Inflater.inflate(R.menu.popup_menu,m);
		
	}
	
 
  
}
