package com.syntax.class21;

public class HomeWork {
	//Write program: Shape class has a constructor
	//that takes the radius and has a subclass as  circle class.
	//In circle class create a method to calculate the area of circle.
	//Test your code
	int r;
	HomeWork(int r){
		this.r=r;
		
	}
}
class circle extends HomeWork{
	double a;
	circle(int r,double a){
		super(r);
		this.a=a;
	}
	public double Area() {
		double area;
		area=r*r*a;
	
		return area;
	}
}
