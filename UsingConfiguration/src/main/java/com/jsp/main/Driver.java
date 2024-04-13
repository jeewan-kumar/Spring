package com.jsp.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.config.Config;
import com.jsp.model.Person;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Person person = context.getBean(Person.class);
		Person person2 = context.getBean(Person.class);
		System.out.println(person);
		System.out.println(person2);
		System.out.println(person.getName());
		System.out.println(person.getPhone());
		System.out.println(person.getAge());
		System.out.println(person.getPanCard());
		System.out.println(person.getPanCard().getName());
	}
}
