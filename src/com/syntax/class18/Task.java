package com.syntax.class18;

public class Task {
	//Write a program that will have a constructor:
	//one with parameters and second without any parameters.
	//Create a separate Test class where you will execute
	//both of the constructors.
	Task(){
		System.out.println("without parameters");
	}
	Task(String str,int num){
		System.out.println("i have string: "+str+" and number: "+num);
	}
	
}
