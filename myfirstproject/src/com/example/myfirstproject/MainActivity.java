package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
//import android.R;

import android.widget.EditText;
//import android.widget.TextView;
import android.widget.Button;
import android.view.View;


public class MainActivity extends Activity {
	
	EditText name;
	Button btn;
	String a;
	EditText display;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.edtName);
        display=(EditText)findViewById(R.id.edtdispName);
        
        btn=(Button)findViewById(R.id.btn1);
    btn.setOnClickListener(new Button.OnClickListener(){public void onClick(View v)
    {
    	display();
    }
    });
    }
    public void display()
    {
    	a=name.getText().toString();
    	display.setText(a);
    }
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
