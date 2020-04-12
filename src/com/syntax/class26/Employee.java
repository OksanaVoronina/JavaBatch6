package com.syntax.class26;

public class Employee {

	//define private variables
	private String name;
	private int age;
	private double salary;
	
	// define public method to give an access to private variables
	//we can read  only,getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double hetSalary() {
		return salary;
	}
	//create public setters
	public void setName(String name) {
		this.name=name;
	}
}
