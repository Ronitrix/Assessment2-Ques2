package com.constructordi;

public class Vehicle {
	
	private int model;
	private String Mname;
	private String Mcolor;
	private BMW bmw;
	
	/* 
	 * Since We are using constructor based dependency injection so
	 * We have created a parameterized constructor which will take the values from
	 * beans.xml where id=vehicle
	 */

	public Vehicle(int model, String Mname, String Mcolor, BMW bmw) {
		super();
		this.model = model;
		this.Mname = Mname;
		this.Mcolor = Mcolor;
		this.bmw = bmw;
	}
	
	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getMname() {
		return Mname;
	}

	public void setMname(String mname) {
		Mname = mname;
	}

	public String getMcolor() {
		return Mcolor;
	}

	public void setMcolor(String mcolor) {
		Mcolor = mcolor;
	}

	public BMW getBmw() {
		return bmw;
	}

	public void setBmw(BMW bmw) {
		this.bmw = bmw;
	}

	public Vehicle() {
		super();
	}

}
