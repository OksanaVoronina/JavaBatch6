package com.syntax.class19;

public class Task1 {
	//Write program as a Student class that has instance variables
	//name and address. Create a constructor that will initialize those variables.
	//Print name & address of given  student using displayInfo method.
	String name,address;
	
	 Task1(String name,String address) {
		this.name=name;
		this.address=address;

	}
	 void displayInfo() {
		System.out.println("Student name is "+name+" and addres is  "+address);
	}
	public static void main(String []args) {
		Task1 student1=new Task1("Oksana","main street");
		student1.displayInfo();
		student1=new Task1("Taras","same street");
		student1.displayInfo();

	}
}
