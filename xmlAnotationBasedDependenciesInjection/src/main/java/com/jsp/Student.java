package com.jsp;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	// @Value(value = "123")
	int id;
	// @Value(value = "Spring")
	String name;
	// @Value(value = "Spring@gmail.com")
	String email;
	@Value(value = "#{{10,20,30, 'hh' , 'kk'}}")
	List list;
	@Value(value = "#{{10,20,30}}")
	int[] a;
	@Value(value = "#{{10,20,30, 'hh' , 'kk'}}")
	Set set;
	@Value(value = "#{{10:20,30:40, 'hh':'kk'}}")
	Map map;
	@Autowired
	Mobiles mobile;

	// Mobile mobile = new Mobile(id, name);

	public Mobiles getMobile() {
		return mobile;
	}

	public void setMobile(Mobiles mobile) {
		this.mobile = mobile;
	}

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//	public Student(@Value(value = "123")int id, @Value(value = "123")String name, @Value(value = "123")String email) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.email = email;
//	}

}
