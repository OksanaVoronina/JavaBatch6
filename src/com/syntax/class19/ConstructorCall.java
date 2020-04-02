package com.syntax.class19;

public class ConstructorCall {

	public ConstructorCall() {
		System.out.println("Iam non argument constructor ");
	}
	public ConstructorCall(String str){
		this();
		System.out.println(str+" ");

	}
	public ConstructorCall(String str,String str2) {
		this(str);// java or you can assing new var"hello" 
		System.out.println(str+" "+str2);
	}
	public void display() {
		
	}
	
	public static void main(String args[]) {
		ConstructorCall obj1=new ConstructorCall("Java","Love");
		
	}
}
