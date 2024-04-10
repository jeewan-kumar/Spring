package com.jsp.laptop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LaptopDrive {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("laptopConfig.xml");
		Laptop laptop = (Laptop)context.getBean("laptop");
		System.out.println(laptop.getId());
		System.out.println(laptop.getName());
	}
}
