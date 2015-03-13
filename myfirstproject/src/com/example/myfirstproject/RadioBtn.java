package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Button;
import android.widget.Toast;

public class RadioBtn extends Activity {
	
	RadioGroup radiogroupwesite;
	RadioButton rb1;
	Button btn1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_radio_btn);
		
		
		addListenerRadioButton();
	}
	
	private void addListenerRadioButton()
	{
		btn1=(Button) findViewById(R.id.rbutton);
		radiogroupwesite=(RadioGroup) findViewById(R.id.rdoGrp);
		btn1.setOnClickListener(new OnClickListener(){
		public void onClick(View v)
		{
			int selected=radiogroupwesite.getCheckedRadioButtonId();
			rb1=(RadioButton) findViewById(selected);
			Toast.makeText(RadioBtn.this, rb1.getText(),Toast.LENGTH_LONG).show();
		}
	});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.radio_btn, menu);
		return true;
	}

}
