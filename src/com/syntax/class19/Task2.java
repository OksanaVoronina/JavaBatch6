package com.syntax.class19;

public class Task2 {
   //Write program as a Book class that will have 2 Constructors.
	//While creating an object make sure:
	//Instance variables are being initialized
	//Both Constructors are being executed Collapse
	Task2(){
	this("anna","onegin");
	

	}
	Task2(String book1,String book2){
		System.out.println("i love "+book1+" "+book2);
	}
	public static void main(String args[]) {
		Task2 books=new Task2();
		
	}
}
