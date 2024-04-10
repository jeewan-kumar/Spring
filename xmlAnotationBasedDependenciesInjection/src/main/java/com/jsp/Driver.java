package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student = (Student)context.getBean("student");
		System.out.println(student.getId()); 
		System.out.println(student.getName()); 
		System.out.println(student.getEmail());
		System.out.println(student.getList());
		System.out.println(student.getA());
		System.out.println(student.getSet());
		System.out.println(student.getMap());
		System.out.println(student.getMobile());
	}
}
