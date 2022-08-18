package com.constructordi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String [] args) {
		
//We are using ApplicationContext, it is used to load bean definitions, wire beans together, and dispense beans upon request
//We can also use BeanFactory but its weaker than ApplicationContext	
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

//We are creating object of Vehicle Class and storing the data from the id employee in beans.xml file	
		
		Vehicle v1=(Vehicle)context.getBean("vehicle");

//Here we are printing the details of the Vehicle
		
		System.out.println("Model:"+v1.getModel());
		System.out.println("Model Name:"+v1.getMname());
		System.out.println("Model Color:"+v1.getMcolor());
		System.out.println(v1.getBmw());
	}

}
