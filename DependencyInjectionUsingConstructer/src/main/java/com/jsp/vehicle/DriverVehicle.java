package com.jsp.vehicle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DriverVehicle {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("vehicleConfig.xml");
		Vehicle vehicle = (Vehicle)context.getBean("vehicle");
		System.out.println(vehicle.getId());
		System.out.println(vehicle.getName());
	}
}
