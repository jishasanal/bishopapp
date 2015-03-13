package com.example.myfirstproject;

public class Product {
	private int _id;
	private int _qty;
	private String _pname;
	
	public Product()
	{}
	public Product(int id,String productname,int qty)
	{
		this._id=id;
		this._pname=productname;
		this._qty=qty;
	}
	public Product(String productname,int qty) 
	{
		this._pname=productname;
		this._qty=qty;
	}
	public void setID(int id)
	{
		this._id=id;
	}
	public int getID()
	{
		return this._id;
	}
	public void setProductname(String productname)
	{
		this._pname=productname;
	}
	public String getProductname()
	{
		return this._pname;
	}
	public void setQuantity(int qty)
	{
		this._qty=qty;
	}
	public int getQuantity()
	{
		return this._qty;
	}
	

}
