package com.example.myfirstproject;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;
import android.app.ActionBar;

public class Tablistener implements ActionBar.TabListener {
	Fragment fragment;
	
	public Tablistener(Fragment fragment)
	{
		this.fragment=fragment;
	}
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		ft.remove(fragment);
	}
	
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		ft.replace(R.id.frametab, fragment);
	}
	
	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub
		
	}

}
