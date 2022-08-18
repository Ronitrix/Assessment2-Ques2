package com.setterdi;

public class Student {
	
	private String name;
	private String rollNo;
	private String className;
	private Report report;
 
	/*
	 * Since we are using property to insert values so we require setters to
	 * set the value of the data members that's why we call this method setter
	 * based dependency injection.
	 *
	 */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Report getReport() {
		return report;
	}
	public void setReport(Report report) {
		this.report = report;
	}
	

}
