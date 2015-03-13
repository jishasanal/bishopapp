package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

public class ArithmaticSpinner extends Activity {
    String arithmatic_op;
    Spinner dropdown1;
    EditText number1,number2,result1;
    double num1;
    double num2;
    Button btnOk;
    double result;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_arithmatic_spinner);
		
		number1=(EditText) findViewById(R.id.edtnum1);
		number2=(EditText) findViewById(R.id.edtnum2);
		result1=(EditText) findViewById(R.id.edtResult);
		dropdown1=(Spinner) findViewById(R.id.spinner2);
		String[] arithmatic_op=new String[]{"Addition","Multiplication","Division","Subtraction"};
		
		ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,arithmatic_op);
		adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		dropdown1.setAdapter(adapter1);
		
		btnOk=(Button) findViewById(R.id.btnok);
		
	
		
		
		dropdown1.setOnItemSelectedListener(new OnItemSelectedListener()
		{
			@Override
	    public void onNothingSelected(AdapterView<?> parent)
	    {
	    
	    }
			@Override
		public void onItemSelected(AdapterView<?> parent, View view,int position,long id)
		{
			
			num1=Double.parseDouble(number1.getText().toString());
			num2=Double.parseDouble(number2.getText().toString());
		
			//dropdown1.setSelection(position);
			String selectoperetion=(String) dropdown1.getSelectedItem();
			Toast.makeText(getApplicationContext(), selectoperetion, Toast.LENGTH_SHORT).show();
			if(selectoperetion.equals("Addition"))
			{
				 result=num1+num2;
				
			}
			
			if(selectoperetion.equals("Subtraction"))
			{
				 result=num1-num2;
				
				
			}
			if(selectoperetion.equals("Division"))
			{
				 result=num1/num2;
				
				
			}
			if(selectoperetion.equals("Multiplication"))
			{
				 result=num1*num2;
				
				
			}
			
			
			
		}} );
		
		btnOk.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				result1.setText(Double.toString(result));
			}
		});
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.arithmatic_spinner, menu);
		return true;
	}

}
