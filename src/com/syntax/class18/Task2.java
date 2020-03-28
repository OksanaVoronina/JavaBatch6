package com.syntax.class18;

public class Task2 {
	//Write a program  that will have 4 different access levels 
	//of constructors and create 3 objects of this class: 
	//1 - inside same class; 2 - from outside the class; 
	//3 - from different class inside different package  and observe result.
	private Task2(){
		System.out.println("Test ");
	} //inside class
	  Task2(char b){
		System.out.println("Test "+b);
	} //CE
	protected Task2(int n){
		System.out.println("Test "+n);
	} //inside project
	public Task2(String nameA, int aA, int bB, int cC){
		String name=nameA;
		int a=aA;
		int b=bB;
		int c=cC;
	} // anyway 
	public static void main(String args[]) {
		Task2 one=new Task2();
		Task2 two=new Task2('a');
		Task2 three=new Task2(8);
		Task2 four=new Task2("oksana",9,4,5);
	}
}
