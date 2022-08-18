package com.constructordi;

public class BMW {
	private int number;
	private int mileage;
	private int engine;
	public BMW() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * We have created a parameterized constructor which will take the values from
	 * beans.xml where id=BMW
	 */
	
	  public BMW(int number, int mileage, int engine) { 
		  super();
		  this.number =number;
		  this.engine = engine;
		  this.mileage = mileage; 
		  }
	public int getNumber() {
		return number;
	}
	public int getEngine() {
		return engine;
	}
	public int getMileage() {
		return mileage;
	}

	@Override
	public String toString() {
		return "BMW [number=" + number + ", mileage=" + mileage + ", engine=" + engine + "]";
	}
	
}
