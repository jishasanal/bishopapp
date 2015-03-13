package com.example.myfirstproject;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class toyotoFragmentTab extends Fragment {
	
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstaceState)
	{
		View rootView=inflater.inflate(R.layout.toyoto_layout, container,false);
		return rootView;
	}

}