package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Person person = (Person)context.getBean("myPerson");
		System.out.println(person.getName());
		System.out.println(person.getAddress());
		System.out.println(person.getList());
		System.out.println(person.getSet());
		System.out.println(person.getA());
		System.out.println(person.getMobile());
		System.out.println(person.getMobile().getBrand());
	}
}
