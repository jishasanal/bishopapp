package com.example.myfirstproject;

//import com.example.mywork.R;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String>{
	
	private final Activity context;
	private final String[] name;
	private final String[] number;
    private final Integer[] imageId;
	public CustomList(Activity context,String[] name,String[] number,Integer[] imageId) {
		super (context,R.layout.contactlistss,name);
		
		this.context=context;
		this.name=name;
		this.number=number;
		this.imageId=imageId;
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public View getView(int position,View view,ViewGroup parent)
	{
		 
		  LayoutInflater inflater=context.getLayoutInflater();
	      View rowView=inflater.inflate(R.layout.contactlistss,null,true);
	      TextView txtcontact=(TextView) rowView.findViewById(R.id.txtcontactname);
	      TextView txtphone=(TextView) rowView.findViewById(R.id.txtnumber);
	     ImageView imgview=(ImageView) rowView.findViewById(R.id.imgcontact);
	      txtcontact.setText(name[position]);
	      txtphone.setText(number[position]);
	      imgview.setImageResource(imageId[position]);
	      	      return rowView;
	}

	
	

}
