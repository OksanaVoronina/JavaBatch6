package com.syntax.class22;

public class Employee {

	double salary;
	
	void getPaid() {
		System.out.println("Employee gets "+salary);
	}
	void work() {
		System.out.println("Employ works");
	}
	
}
class FullTime extends Employee{
	double hourRate;
	void getPaid() {
		System.out.println("Employee gets "+hourRate);
	}
}
