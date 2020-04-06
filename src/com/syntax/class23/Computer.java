package com.syntax.class23;
class Smart{
	void smart() {
		System.out.println("Smart comp");
	}
}
public class Computer extends Smart{
	//Create a Class Computer that will have 4 subclasses 
	//as Apple, Lenovo, HP, Dell. 

	//Define common behavior within and some fields in parent class 
	//and override some of the methods in child classes
	//Define some methods specific to child classes
	//Create objects of child classes and store them into array.
	//Loop through each object and execute available methods.
	String make;
	Computer(String make){
		this.make=make;
	}
	void print() {
		System.out.println("computer can print ");
	}
	void play() {
		System.out.println("computer can play music ");

	}

}
class Apple extends Computer{
	 Apple(String make){
		 super(make);
	 }
	void print() {
		System.out.println(make+" can print and safe ");

	}
	void play() {
		System.out.println(make+" can play music and movis  ");
	}
}
class Lenovo extends Computer{
	Lenovo(String make){
		super(make);
	}
	
	void print() {
		System.out.println(make +" can not print  ");

	}
	void play() {
		System.out.println(make+" can not  play music ");
	}
}
class HP extends Computer{
	HP(String make){
	super(make);	
	}
	void print() {
		System.out.println(make+" can print 2D");

	}
	void play() {
		System.out.println(make+" can play music and karaoki ");

	}


}