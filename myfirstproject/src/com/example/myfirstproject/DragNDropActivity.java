package com.example.myfirstproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.util.Log;
import android.view.DragEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnLongClickListener;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class DragNDropActivity extends Activity {

	ImageView img;
	private static final String IMAGEVIEW_TAG="Android Logo";
	String msg;
	private android.widget.RelativeLayout.LayoutParams layoutParams;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_drag_ndrop);
		
		img=(ImageView) findViewById(R.id.logo);
		img.setTag(IMAGEVIEW_TAG);
		img.setOnLongClickListener(new OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				// TODO Auto-generated method stub
				ClipData.Item item=new ClipData.Item((CharSequence)v.getTag());
				String[] mimetype= {ClipDescription.MIMETYPE_TEXT_PLAIN};
				ClipData dragdata=new ClipData(v.getTag().toString(),mimetype,item);
				View.DragShadowBuilder myshadow=new DragShadowBuilder(img);
				
				boolean startDrag = v.startDrag(dragdata, myshadow, null, 0);
				
				return true;
			}
		});
		
		img.setOnDragListener(new OnDragListener() {
			
			@Override
			public boolean onDrag(View v, DragEvent event) {
				// TODO Auto-generated method stub
			  switch(event.getAction())	
			  
			  {
			  case DragEvent.ACTION_DRAG_STARTED:
			  layoutParams=(RelativeLayout.LayoutParams)v.getLayoutParams();
				  Log.d("msg","ACTION_DRAG_STARTED");
				  break;
			  case DragEvent.ACTION_DRAG_ENTERED:
				  int x_cord=(int) event.getX();
				  int y_cord=(int) event.getY();
				  break;
			  case DragEvent.ACTION_DRAG_EXITED:
				  x_cord=(int) event.getX();
				  y_cord=(int) event.getY();
				  layoutParams.leftMargin=x_cord;
				  layoutParams.topMargin=y_cord;
				  v.setLayoutParams(layoutParams);
				  break;
			  case DragEvent.ACTION_DRAG_LOCATION:
				  x_cord=(int) event.getX();
				  y_cord=(int) event.getY();
			  case DragEvent.ACTION_DRAG_ENDED:
				  break;
			  case DragEvent.ACTION_DROP:
				  break;
				  default: break;
			  
			  }
				
				return true;
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.drag_ndrop, menu);
		return true;
	}

}
