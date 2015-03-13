package com.example.myfirstproject;

import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;
import android.net.Uri;
//import android.content.CursorLoader;
import android.content.ContentValues;
//import android.database.Cursor;
import android.view.View;
//import android.view.Menu;
import android.widget.EditText;
import android.widget.Toast;




public class StudentDetails extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student_details);
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.student_details, menu);
		return true;
	}

	public void onClickAddMe(View view)
	{
		
		ContentValues values=new ContentValues();
		values.put(StudentsProviders.NAME,((EditText)findViewById(R.id.edtdbname)).getText().toString());
		values.put(StudentsProviders.GRADE,((EditText)findViewById(R.id.edtdbgrade)).getText().toString());
		Uri uri=getContentResolver().insert(StudentsProviders.CONTENT_URI, values);
		Toast.makeText(getApplicationContext(), uri.toString(), Toast.LENGTH_LONG).show();
	}
}
