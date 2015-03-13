package com.example.myfirstproject;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.EditText;
import android.app.Activity;
import android.view.Menu;
import android.view.View;


public class Spinnerexample extends Activity implements OnItemSelectedListener {
	
	Spinner sp;
	double num1,num2,result;
	EditText edtResult,edtNum1,edtNum2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinnerexample);
		
			edtNum1=(EditText) findViewById(R.id.edtnumber1);
			edtNum2=(EditText) findViewById(R.id.edtnumber2);
			edtResult=(EditText) findViewById(R.id.edtRes);
			//num1=Double.parseDouble(number1.getText().toString());
		
			
			
			
		sp=(Spinner) findViewById(R.id.spinner3);
		
		String[] adapter=new String[]{"Choose","Add","Div","Sub","Mult"};
		ArrayAdapter<String> aa=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,adapter);
		aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp.setAdapter(aa);
		sp.setOnItemSelectedListener(this);
			}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.spinnerexample, menu);
		return true;
	}


	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	if(arg2>0)	
	{
		String selectoperetion=(String) sp.getSelectedItem();
		num1=Double.parseDouble(edtNum1.getText().toString());
		num2=Double.parseDouble(edtNum2.getText().toString());
		if(selectoperetion.equals("Add"))
		{
			result=num1+num2;
			edtResult.setText(Double.toString(result));
		}
		if(selectoperetion.equals("Sub"))
		{
			result=num1-num2;
			edtResult.setText(Double.toString(result));
		}
		
		Toast.makeText(getApplicationContext(),selectoperetion, Toast.LENGTH_SHORT).show();
	}
	}
	@Override
    public void onNothingSelected(AdapterView<?> parent)
    {
    
    }

}
