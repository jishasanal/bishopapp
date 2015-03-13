package com.example.myfirstproject;

import android.os.Bundle;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;

import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;
//import android.view.inputmethod.EditorInfo;
import android.widget.Toast;
import android.widget.Button;


public class SampleRegForm extends Activity {

    TextView txtview;	
    Button btnsub;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sample_reg_form);
		
		Spinner dropdown=(Spinner) findViewById(R.id.spinner1);
		String[] quaqlification=new String[]{"ChooseQualification","BA","Bsc","BBA","MA","Msc","MCA","MBA"};
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,quaqlification);
		dropdown.setAdapter(adapter);
		
		txtview=(TextView) findViewById(R.id.txtrfname);
		btnsub=(Button) findViewById(R.id.btnsubmit);
		
		btnsub.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v){
			
			
		       Toast.makeText(getApplicationContext(), "Successfully Submitted", Toast.LENGTH_SHORT).show();
			}
		});
		//final String  firstname=txtview.getText().toString();
		txtview.setOnEditorActionListener(new TextView.OnEditorActionListener() {
					
			@Override
			public boolean onEditorAction(TextView arg0, int arg1, KeyEvent arg2) {
				// TODO Auto-generated method stub
				
				if(arg2.getKeyCode()==KeyEvent.KEYCODE_ENTER)
				{
				 Toast.makeText(getApplicationContext(), arg0.getText(), Toast.LENGTH_SHORT).show();
				}
				 
				return false;
			}
		});
		
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sample_reg_form, menu);
		return true;
	}

}
