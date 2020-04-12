package com.syntax.class24;

public abstract class Vehicle {
	
	String color;
	static int total;
	Vehicle(String color){
		this.color=color;
		total++;//count total of created obj
	}
	public static void total() {//to count total of created obj
	System.out.println(total);
	}
	public void drive() {
		System.out.println("Vihicle drives");
	}
	public void stop() {
		System.out.println("Vihicle stops");
	}
	public abstract void start();
	public abstract void brake();
}


abstract class  Car extends Vehicle{
	String carType;
	
	Car(String color,String carType){
		super(color);
		this.carType=carType;
	}
	public void brake() {
		System.out.println(carType+" have breaks");
	}
	
}

class Tesla extends Car{
	String make;
	Tesla(String color,String carType,String make){
		super(color,carType);
		this.make=make;
	}
	@Override
	public void start() {
		System.out.println(make+" starts remotely");
	}
}
class Toyota extends Car{
	String make;
	Toyota(String color,String  carType,String make){
		super(color,carType);
		this.make=make;
	}
	@Override
	public void start() {
		System.out.println(" starts remotely");
	}

}
class Bus extends Car{
	String make;
	Bus(String color,String  carType,String make){
		super(color,carType);
		this.make=make;
	}
	@Override
	public void start() {
		System.out.println(make+" starts with key");
	}
	

}
class SchoolBus extends Bus{
	
	SchoolBus(String make,String color,String carType){
		super(make,color,carType);
		
	}
	@Override
	public void start() {
		System.out.println(make+" starts school bus key");
	}
	@Override
	public void drive() {
		System.out.println(make+"Schoole bus drive");
	}
	@Override
	public void stop() {
		System.out.println(make+"Stops");
	}

}











