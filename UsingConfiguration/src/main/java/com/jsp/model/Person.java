package com.jsp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
@PropertySource(value = "classpath:Data.properties")
public class Person {
	//@Value(value = "abc")
	@Value(value = "${name}")
	private String name;
	
	@Value(value = "${phone}")
	//@Value(value = "7870794231")
	private long phone;
	
	@Value(value = "${age}")
	//@Value(value = "20")
	private int age;
	@Autowired
	PanCard panCard;
	
	
	public PanCard getPanCard() {
		return panCard;
	}
	public void setPanCard(PanCard panCard) {
		this.panCard = panCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public Person(String name, long phone, int age) {
//		super();
//		this.name = name;
//		this.phone = phone;
//		this.age = age;
//	}
//	public Person() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	
	
}
