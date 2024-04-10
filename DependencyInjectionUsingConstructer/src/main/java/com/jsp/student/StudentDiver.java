package com.jsp.student;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDiver {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("studentConfig.xml");
		Student student = (Student)context.getBean("student");
		System.out.println(student.getId());
		System.out.println(student.getName());
	}
}
