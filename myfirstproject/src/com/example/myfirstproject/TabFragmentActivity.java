package com.example.myfirstproject;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;
import android.view.Menu;

public class TabFragmentActivity extends Activity {
	
	
	ActionBar.Tab bmwtab,fordtab,toyotatab;
	Fragment bmwfragmenttab=new bmwFragmentTab();
	Fragment fordfragmenttab=new fordFragmentTab();
	Fragment toyotofragmenttab=new toyotoFragmentTab();
	//private Fragment fragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab_fragment);
		
		ActionBar actionbar=getActionBar();
		
		actionbar.setDisplayShowHomeEnabled(false);
		actionbar.setDisplayShowTitleEnabled(false);
		actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		bmwtab=actionbar.newTab().setText("Tab1");
		fordtab=actionbar.newTab().setText("Tab2");
		toyotatab=actionbar.newTab().setText("Tab3");
		
		bmwtab.setTabListener(new Tablistener(bmwfragmenttab));
		fordtab.setTabListener(new Tablistener(fordfragmenttab));
		toyotatab.setTabListener(new Tablistener(toyotofragmenttab));
		
		actionbar.addTab(bmwtab);
		actionbar.addTab(fordtab);
		actionbar.addTab(toyotatab);
		//this.fragment=fragment;
	}		
			
		
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tab, menu);
		return true;
	}

}
