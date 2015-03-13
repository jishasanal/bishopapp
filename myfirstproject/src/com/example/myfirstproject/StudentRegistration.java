package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Spinner;
import android.widget.ArrayAdapter;


public class StudentRegistration extends Activity {
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student_registration);
		Spinner dropdown=(Spinner) findViewById(R.id.spinner1);
		String[] quaqlification=new String[]{"ChooseQualification","BA","Bsc","BBA","MA","Msc","MCA","MBA"};
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,quaqlification);
		dropdown.setAdapter(adapter);
		
	}
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.student_registration, menu);
		return true;
	}

}
