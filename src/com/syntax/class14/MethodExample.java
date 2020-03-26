package com.syntax.class14;

public class MethodExample {

	void greet(String name) {
		System.out.println("hello"+name);
	}
	
	public static void main(String args []) {
		
MethodExample object1=new MethodExample();
object1.greet(" oksana");
object1.greet(" anna ");

	}
}
