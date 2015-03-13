package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.view.Menu;

public class MyFragmentsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_fragments);
		
		Configuration config=getResources().getConfiguration();
		FragmentManager fragmentmanager=getFragmentManager();
		FragmentTransaction fragmenttranc=fragmentmanager.beginTransaction();
		
		if(config.orientation==Configuration.ORIENTATION_LANDSCAPE)
		{
			LM_Fragment ls_fragment=new LM_Fragment();
			fragmenttranc.replace(android.R.id.content,ls_fragment);
		}
		else{
			PM_Fragment pm_fragment=new PM_Fragment();
			fragmenttranc.replace(android.R.id.content,pm_fragment);
			
		}
		fragmenttranc.commit();
		
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_fragments, menu);
		return true;
	}

}
