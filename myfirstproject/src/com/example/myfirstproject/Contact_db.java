package com.example.myfirstproject;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Contact_db extends SQLiteOpenHelper{
	
	public  static final int DATABASE_VERSION=1;
	public static final String DATABASE_NAME="Contactlistdb_db";
	public static final String TABLE_NAME="Contact_table";
	public static final String COLUMN_ID="id";
	public static final String COLUMN_CONTACT="name";
	
	public static final String COLUMN_NUMBER="number";
	
		


	

	
	

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
		String CREATE_CONTACT_TABLE = "CREATE TABLE " +
				TABLE_NAME + "("
	             + COLUMN_ID + " INTEGER PRIMARY KEY," + COLUMN_CONTACT 
	             + " TEXT," + COLUMN_NUMBER + " INTEGER" + ")";

		
		
		
		db.execSQL(CREATE_CONTACT_TABLE);
		
		ContentValues insertvalues= new ContentValues();
		insertvalues.put(COLUMN_ID, 1);
		insertvalues.put(COLUMN_CONTACT, "JISHA");
		insertvalues.put(COLUMN_NUMBER, 11111111);
		db.insert(TABLE_NAME, null,insertvalues);
		//final String Insert_Data="INSERT INTO" + TABLE_NAME  + " VALUES (1,'JISHA','023456781')";
		//db.execSQL(Insert_Data);
		//db.close();
	}

	public Contact_db(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}





	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXIST" + TABLE_NAME);
		onCreate(db);
		
		
	}
/*	public ArrayList<String> selectAll()
	{
		ArrayList<String> list= new ArrayList<String>();
		String query= "SELECT * FROM " + TABLE_NAME ;
		
		SQLiteDatabase db=this.getReadableDatabase();
		Cursor cursor=db.rawQuery(query, null);
		if (cursor.moveToFirst())
		{
			do
			{
				
			//list.add(cursor.getString(0));
			list.add(cursor.getString(1));
			list.add(cursor.getString(2));
			}while(cursor.moveToNext());
		}
		cursor.close();
		db.close();
		return list;
	}*/
	
	

}
