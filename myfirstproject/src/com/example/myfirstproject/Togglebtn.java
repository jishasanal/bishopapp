package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.widget.ToggleButton;
import android.view.View.OnClickListener;


public class Togglebtn extends Activity {
	
	ToggleButton togglebtn1,togglebtn2;
	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_togglebtn);
		
		togglebtn1=(ToggleButton) findViewById(R.id.toggleButton1);
		togglebtn2=(ToggleButton) findViewById(R.id.toggleButton2);
		btn=(Button) findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				StringBuffer result=new StringBuffer();
			    result.append("start condition").append(togglebtn1.getText());
			    result.append("\n stop condition").append(togglebtn2.getText());
			    Toast.makeText(Togglebtn.this,result.toString(),Toast.LENGTH_SHORT).show();
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.togglebtn, menu);
		return true;
	}

}
