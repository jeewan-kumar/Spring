package com.jsp;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	String name;
	String address;
	private List list;
	private Set set;
	private int[] a;
	private Map<Integer, String> map;
	private Mobile mobile;
	public String getName() {
		return name;
	}
	public Person(String name, String address, List list, Set set, int[] a, Map<Integer, String> map, Mobile mobile) {
		super();
		this.name = name;
		this.address = address;
		this.list = list;
		this.set = set;
		this.a = a;
		this.map = map;
		this.mobile = mobile;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Set getSet() {
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
}
