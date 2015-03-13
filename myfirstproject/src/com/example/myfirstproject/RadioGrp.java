package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RadioGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;


public class RadioGrp extends Activity {
	
	RadioGroup rgp,rgp1;
	Button btns,btnw;
	RadioButton buttonstar,buttonwritter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_radio_grp);
		addListenerRadioGroup1();
		addListenerRadioGroup2();
		
	}
	public void addListenerRadioGroup1()
	{
		rgp=(RadioGroup) findViewById(R.id.radioGroup1);
		btns=(Button) findViewById(R.id.starbtn);
		btnw=(Button) findViewById(R.id.writterbtn);
		btns.setOnClickListener(new OnClickListener()
		{
		public void onClick(View v)
		{
			int selected=rgp.getCheckedRadioButtonId();
			buttonstar=(RadioButton) findViewById(selected);
			Toast.makeText(RadioGrp.this, buttonstar.getText(), Toast.LENGTH_SHORT).show();
		}
				
	});
	}
	public void addListenerRadioGroup2()
	{
		rgp1=(RadioGroup) findViewById(R.id.radioGroup2);
		btnw.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				int selected=rgp1.getCheckedRadioButtonId();
				buttonwritter=(RadioButton) findViewById(selected);
				Toast.makeText(RadioGrp.this,buttonwritter.getText(),Toast.LENGTH_SHORT).show();
			}
			
		});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.radio_grp, menu);
		return true;
	}

}
