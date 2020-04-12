package com.syntax.class25;

public class ShapeTest {
public static void main(String args[]) {
	Shape area=new Circle(14);
	area.calculateArea();
	area.calculatePerimiter();
	
	Shape area1=new Square(6);
	area1.calculateArea();
	area1.calculatePerimiter();
}	
}
