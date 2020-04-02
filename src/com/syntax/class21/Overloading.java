package com.syntax.class21;

public class Overloading {
	//Create 1 class in which create a methods that will calculate the area (volume) of 
	//Rectangle
	//Square
	//Box
	int length,width,height;
	public void area(int length,int width,int height) {
		double area= length+width+height;
		System.out.println("area of box is "+area);
	}
	public void area(int length,int width,double height) {
		double area=(length*width+width*height)*2;
		System.out.println("area of rectangel is "+area);

	}
	public void area(double length,double width,double height ) {
		double area=(length*width+width*height)*2;
		System.out.println("area of square is "+area);

	}
}
