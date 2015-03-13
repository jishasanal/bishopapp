package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.view.View;
import android.widget.TextView;
import android.widget.CheckBox;

public class CheckboxMainActivity extends Activity {

	CheckBox male,female;
	TextView display;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_checkbox_main);
		
		male=(CheckBox)findViewById(R.id.cbxMale);
		female=(CheckBox)findViewById(R.id.cbxFemale);
		display=(TextView)findViewById(R.id.edtDisplay1);
		male.setOnClickListener(new CheckBox.OnClickListener()
		{
			
		public void onClick(View v)
		{ 
		  if(male.isChecked())
		  {
			display.setText("Male checked");  
		  
		  }
		  else
		  {
			  display.setText("Female Checked");
		  }
	  }
  });
		  }
	

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.checkbox_main, menu);
		return true;
	}

}
