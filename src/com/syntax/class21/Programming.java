package com.syntax.class21;

public class Programming {
//	Create a class named ‘Programming’. 
	//While creating an object of the class,
	//if nothing is passed to it, then the message
	//“I love programming languages” should be printed.
	//If some String is passed to it, then in place of
	//“programming languages” the value variable should be printed.
	//Example, if we pass “Java”, then “I love Java” should be printed.
String str;
Programming(String str){
	this.str=str;
}
public void display() {
	System.out.println("i love "+str);
	
}
}
 class ProgramTest {

public static void main(String args[]) {
	Programming obj=new Programming("Java");
	obj.display();
}
}

