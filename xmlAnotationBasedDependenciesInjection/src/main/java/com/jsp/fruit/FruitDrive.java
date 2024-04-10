package com.jsp.fruit;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FruitDrive {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("fruitConfig.xml");
		Fruit fruit = (Fruit)context.getBean("fruit");
		System.out.println(fruit.getId()); 
		System.out.println(fruit.getName()); 
	}
}
