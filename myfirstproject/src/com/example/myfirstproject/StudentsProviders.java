package com.example.myfirstproject;

import java.util.HashMap;


import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
//import android.database.sqlite.SQLiteQueryBuilder;

import android.net.Uri;
//import android.text.TextUtils;
//import android.widget.Toast;

public class StudentsProviders extends ContentProvider{
	
	
	static final String PROVIDER_NAME="com.example.provider.college";
	static final String URI="content://"+PROVIDER_NAME+"/students";
	static final Uri CONTENT_URI=Uri.parse(URI);//**************************88//
	
	static final String ID="id";
	static final String NAME="name";
	static final String GRADE="grade";
	
	public static HashMap <String,String> Student_projection_map;
	
	static final int STUDENT=1;
	static final int STUDENT_ID=2;
	static final UriMatcher urimatcher;
	
	static{
		urimatcher=new UriMatcher(UriMatcher.NO_MATCH);
		urimatcher.addURI(PROVIDER_NAME, "students", STUDENT);
		urimatcher.addURI(PROVIDER_NAME, "students/#", STUDENT_ID);
		
	}

	//**database specific constant declaration**************//
	
	private static SQLiteDatabase db;
	static final String database_name="college";
	static final String student_table_name="students";
	static final int database_version=1;
	static final String Create_DB_Table="CREATE TABLE"+student_table_name+"(ID INTEGER PRIMARY KEY AUTOINCREMENT,"+
	"NAME TEXT NOT NULL,"+	"GRADE TEXT NOT NULL);";
	
	
	
	private static class DatabaseHelper extends SQLiteOpenHelper
	{
		DatabaseHelper (Context context)
		{
			super(context,database_name,null,database_version);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL(Create_DB_Table);
		}

		@Override
		public void onUpgrade(SQLiteDatabase arg0, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE IF EXISTS"+student_table_name);
			onCreate(db);
		}
	}
	
	@Override
	public boolean onCreate()
	{
		Context context=getContext();
		DatabaseHelper dbhelper=new DatabaseHelper(context);
		db=dbhelper.getWritableDatabase();
		return (db==null)?false:true;
		
	}
	@Override
	public Uri insert(Uri uri, ContentValues values) {
		// TODO Auto-generated method stub
		long rowid=db.insert(student_table_name,"", values);
		if(rowid>0)
		{
			Uri uris=ContentUris.withAppendedId(CONTENT_URI,rowid);
			getContext().getContentResolver().notifyChange(uris, null);
			return uris;
		}
	
		throw new SQLException("failed to add record"+uri);
	}
	
	
	@Override
	public Cursor query(Uri arg0, String[] arg1, String arg2, String[] arg3,
			String arg4) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int update(Uri arg0, ContentValues arg1, String arg2, String[] arg3) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int delete(Uri arg0, String arg1, String[] arg2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getType(Uri arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	

			
	
	
	

}
