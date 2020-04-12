package com.syntax.class25;

public interface Shape {
	//Create an Interface ‘Shape’ with undefined methods
	//as calculateArea and calculatePerimiter. 
	//Create 2 classes Circle & Square that 
	//implements functionality defined in the Shape Interface.
	
	
	void calculateArea();
	void calculatePerimiter();
}
class Circle implements Shape{
	double r;
	
	Circle(double r){
		this.r=r;   
	}
	
	public void calculateArea() {
		System.out.println("area of Circle is "+(r*r*r));
	}
	public void calculatePerimiter() {
		System.out.println("perimiter of Circle is "+(2*r));

	}
}
class Square extends Circle implements Shape{
	
	Square(double r){
		super(r);
		
	}
	
	public void calculateArea() {
		System.out.println("area of Square is "+(r*r));
	}
	public void calculatePerimiter() {
		System.out.println("perimiter of Square is "+(r+r+r+r));

	}	
}
