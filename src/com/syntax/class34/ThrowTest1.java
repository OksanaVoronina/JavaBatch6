package com.syntax.class34;

public class ThrowTest1 {
public static void main(String[] args) {
	//Create a method to check age eligibility that will throw a runtime exception.
	//Method should throw an exception age is less than 16.
	eligibility("oknana");
	
}
/**
 * 
 * @param username
 */
public static void eligibility(String username) {
	if(username.length()<5) {
		throw new RuntimeException("you are to young");
	}else {
		System.out.println("come in");
	}
}
}
