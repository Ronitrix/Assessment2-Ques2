package com.setterdi;

public class Report {
	
	private int mathematics;
	private int physics;
	private int chemistry;
	private int biology;
	
	/*
	 * Since we are using property to insert values so we require setters to
	 * set the value of the data members that's why we call this method setter
	 * based dependency injection.
	 *
	 */
	
	public int getMathematics() {
		return mathematics;
	}
	public void setMathematics(int mathematics) {
		this.mathematics = mathematics;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getBiology() {
		return biology;
	}
	public void setBiology(int biology) {
		this.biology = biology;
	}
 
	

}
