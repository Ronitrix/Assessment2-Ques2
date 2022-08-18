package com.setterdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Main {
 public static void main(String[] args) {
	 
/*
 * We are using ApplicationContext, it is used to load bean definitions, wire
 * beans together, and dispense beans upon request We can also use BeanFactory
 * but its weaker than ApplicationContext
 */
 
  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
  
//We are creating bean object of Student Class and storing the data from the id student in beans.xml file
 
  Student student = (Student) context.getBean("student");
  System.out.println("Student Details: ");
  System.out.println("Name: " + student.getName());
  System.out.println("RollNo: " + student.getRollNo());
  System.out.println("Class: " + student.getClassName());
 
  Report report = student.getReport();
  int a=report.getMathematics()+report.getPhysics()+report.getChemistry()+report.getBiology();
 
  System.out.println("Student Report Card: ");
  System.out.println("Mathematics: " + report.getMathematics());
  System.out.println("Physics: " + report.getPhysics());
  System.out.println("Chemistry: " + report.getChemistry());
  System.out.println("Biology: " + report.getBiology());
  System.out.println("Total:"+a);
 } 
}
