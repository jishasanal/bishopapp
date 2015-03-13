package com.example.myfirstproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.SQLException;


import android.util.Log;
import android.view.Menu;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.ListView;
//import android.widget.ArrayAdapter;
//import android.util.Log;

public class Db_ProductActivity extends Activity {
	
	TextView id;
	EditText edtProductname;
	EditText edtQuantity;
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_db__product);
		
		id=(EditText) findViewById(R.id.dbedtId);
		edtProductname=(EditText) findViewById(R.id.dbedtPname);
		edtQuantity=(EditText) findViewById(R.id.dbedtQut);
		lv=(ListView) findViewById(R.id.dblist);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.db__product, menu);
		return true;
	}
	
	public void newProduct(View view)
	{
		
	   Database dbHandler=new Database(this,null,null,1);
	   int Qty=Integer.parseInt(edtQuantity.getText().toString());
	   Product product=new Product(edtProductname.getText().toString(),Qty);
	   
	   dbHandler.addProduct(product);
	   edtProductname.setText("");
	   edtQuantity.setText("");
	}
	public void lookupProduct(View view)
	{
		
		Database dbHandler=new Database(this,null,null,1);
		Product product=dbHandler.findProduct(edtProductname.getText().toString());
		//Log.e("find",+ product +);
		if(product!=null)
		{
			id.setText(String.valueOf(product.getID()));
			edtQuantity.setText(String.valueOf(product.getQuantity()));
		}
		else
		{
			id.setText("No match found");
		}
			
	}
	public void removeProduct(View view)
	{
		Database dbHandler=new Database(this,null,null,1);
		boolean result=dbHandler.deleteProduct(edtProductname.getText().toString());
		
		if(result)
		{
			id.setText(edtProductname.getText().toString()+ "Successfully Removed");
		}
		else
		{
			id.setText("no match found");
		}
		 edtProductname.setText("");
		   edtQuantity.setText("");
	}
	public void updateProduct(View view)
	{
		   Database dbHandler=new Database(this,null,null,1);
		   int Qty=Integer.parseInt(edtQuantity.getText().toString());
		   Product product=new Product(edtProductname.getText().toString(),Qty);
		   boolean result=dbHandler.updateProductDetails(product);
		   if (result)
		   {
			   id.setText("Successfully Updated");
		   }
		   edtProductname.setText("");
		   edtQuantity.setText("");
	}
	public void RetriveAll(View view)
	{
		Log.e("retive","intent");
		Intent intent=new Intent(this,IntentproductMainActivity.class);
		startActivity(intent);
		
	}

}

