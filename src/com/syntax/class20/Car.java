package com.syntax.class20;

public class Car {
String make,model;
	public Car() {
		
System.out.println("i am parent class constructor");
		}
	public Car(String make,String model) {
		this.make=make;
		this.model=model;
		
	}
}
class Mercedes extends Car{
	String sportModel;
	public Mercedes() {
		System.out.println("I am child class constructor");
	}
	public Mercedes(String make,String model,String sportModel) {
		super(make,model);
		this.sportModel=sportModel;
	}
	public void display() {
		System.out.println("my car is "+make+" "+model+" "+ sportModel);
	}
}// main method need to be in separate class
	 class CarTest {

		
		public static void main(String args[]) {
			Car car=new Car();
			
			Mercedes mar=new Mercedes("Sls","5","lm");
			mar.display();
		}
	}


