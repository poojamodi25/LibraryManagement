package com.library.management.bean;

public class Student {
	
	private String name;
	private String address;
	public String getName() {
		return name;
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
	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	

}
