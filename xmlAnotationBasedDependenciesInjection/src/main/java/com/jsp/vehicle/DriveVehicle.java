package com.jsp.vehicle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DriveVehicle {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("vehicleConfig.xml");
		Vechicle vechicle = (Vechicle)context.getBean("vechicle");
		System.out.println(vechicle.getId()); 
		System.out.println(vechicle.getName()); 
	}
}
