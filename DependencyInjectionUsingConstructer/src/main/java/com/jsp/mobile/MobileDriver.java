package com.jsp.mobile;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("mobileConfig.xml");
		Mobile mobile = (Mobile)context.getBean("mobile");
		System.out.println(mobile.getId());
		System.out.println(mobile.getName());
	}
}
