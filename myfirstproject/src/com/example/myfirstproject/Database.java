package com.example.myfirstproject;

import java.util.HashMap;
//import java.util.List;
//import java.util.List;
import java.util.ArrayList; 

import android.content.ContentValues;
import android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;


//import android.widget.Toast;

public class Database extends SQLiteOpenHelper{

	public static final int DATABASE_VERSION=1;
	public static final String DATABASE_NAME="productdb_db";
	public static final String TABLE_NAME="products";
	
	public static final String COLUMN_ID="id";
	public static final String COLUMN_PRODUCTNAME="productname";
	public static final String COLUMN_QUANTITY="quantity";
	
	//private int delete;
	
	
	public Database(Context context, String name,CursorFactory factory,int version)
	{
		super(context, DATABASE_NAME, factory, DATABASE_VERSION);
		
	}
	
	public void onCreate(SQLiteDatabase db)
	{
		String CREATE_PRODUCTS_TABLE = "CREATE TABLE " +
				TABLE_NAME + "("
	             + COLUMN_ID + " INTEGER PRIMARY KEY," + COLUMN_PRODUCTNAME 
	             + " TEXT," + COLUMN_QUANTITY + " INTEGER" + ")";
	      db.execSQL(CREATE_PRODUCTS_TABLE);
		//String CREATE_PRODUCT_TABLE="CREATE TABLE"+TABLE_NAME+"("+COLUMN_ID+"INTEGER PRIMARY KEY,"+COLUMN_PRODUCTNAME+"TEXT,"+COLUMN_QUANTITY+"INTEGER;"+")";
		//db.execSQL(CREATE_PRODUCT_TABLE);
	}
	public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
	{
		db.execSQL("DROP TABLE IF EXIST"+TABLE_NAME);
		onCreate(db);
		
	}
	
	public void addProduct(Product product)
	{
		SQLiteDatabase db=this.getWritableDatabase();
		
		ContentValues values=new ContentValues();
		values.put(COLUMN_PRODUCTNAME, product.getProductname());
		values.put(COLUMN_QUANTITY, product.getQuantity());
		Log.e("PPPPPPPPPPPPPPPPPPP", "insert");
		//
		
		//SQLiteDatabase db = this.getWritableDatabase();
		db.insert(TABLE_NAME,null,values);
	    db.close();
	}
	public Product findProduct(String productname)
	{
		//String query = "Select * FROM " + TABLE_PRODUCTS + " WHERE " + COLUMN_PRODUCTNAME + " =  \"" + productname + "\"";
		
		String query=" Select * FROM " + TABLE_NAME + " WHERE " + COLUMN_PRODUCTNAME + " = '" +productname+ "'";
		
		SQLiteDatabase db=this.getWritableDatabase();
		Cursor cursor=db.rawQuery(query,null);
		Product product=new Product();
		Log.e("lookup","find");
		if(cursor.moveToFirst())
		{
			cursor.moveToFirst();
			product.setID(Integer.parseInt(cursor.getString(0)));
			product.setProductname(cursor.getString(1));
			product.setQuantity(Integer.parseInt(cursor.getString(2)));
			cursor.close();
			
		}
		else
		{
			product=null;
		}
		db.close();
		return product;
	}
	public boolean deleteProduct(String productname)
	{
		SQLiteDatabase db=this.getWritableDatabase();
		Product product=new Product();
		//db.delete(" DELETE FROM"+TABLE_NAME+ " WHERE " + COLUMN_PRODUCTNAME + " = \"" + productname + "\"");
		db.delete(TABLE_NAME, COLUMN_PRODUCTNAME + " = ?",
	            new String[] { String.valueOf(product.getProductname()) });
		
		db.close();
		
		return true;
	}
	
	/*public boolean deleteProduct(String productname)
	{
		boolean result=false;
		String query=" SELECT * FROM "+TABLE_NAME+ " WHERE " + COLUMN_PRODUCTNAME + " = \"" + productname + "\"";
		SQLiteDatabase db=this.getWritableDatabase();
		Cursor cursor=db.rawQuery(query,null);
		Product product=new Product();
		if(cursor.moveToFirst)
		{
		   product.setId(Integer.parseInt(cursor.getString(0)));
		   db.delete(TABLE_NAME, COLUMN_PRODUCTNAME + " = ?",
	            new String[] { String.valueOf(product.getProductname()) });
		
		}
		
	}*/
	public boolean updateProductDetails(Product product)
	{
		
		SQLiteDatabase db=this.getWritableDatabase();
		ContentValues values=new ContentValues();
		values.put(COLUMN_PRODUCTNAME,product.getProductname());
		values.put(COLUMN_QUANTITY,product.getQuantity());
		
		Log.e("update", "update");
		db.update(TABLE_NAME, values, COLUMN_ID + " =?" ,
				new String[] { String.valueOf(product.getID()) });
		// db.execSQL(exc);
		db.close();
		return true;
		
	}

	public ArrayList<String> selectAll()
	{
		
		ArrayList<String> List=new ArrayList<String>();
		String query=" Select * FROM " + TABLE_NAME ;
		//AlertDialog alert=new AlertDialog.Builder(this).create();
		SQLiteDatabase db=this.getReadableDatabase();
		Cursor cursor=db.rawQuery(query,null);
		
		if(cursor.moveToFirst())
		{
			do{
				
				List.add(cursor.getString(1));
										
			} while(cursor.moveToNext());
			
	}
		cursor.close();
		
		db.close();
		return List;

			
}
}
