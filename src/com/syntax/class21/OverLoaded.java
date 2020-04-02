package com.syntax.class21;

public class OverLoaded {
	//Create 1 class with a static method that has 3 overloaded forms.
	//Then call each overloaded method with specific arguments and observe result.
	
	//Create 1 class with a private method that has 3 overloaded forms. 
	//Then call each overloaded method with specific arguments and observe result.
 String language;
	static void call(String language) {
	
	System.out.println("hello "+language);
}
static  void call(String name,String language) {
	
	System.out.println(name+" "+language);
}
static void call(String a,String name,String language) {
	System.out.println(a+" "+" "+name+" " +language);
}
public static void main(String args[]){
	OverLoaded over=new OverLoaded();
	over.call("guys");
	over.call("hello");
	over.call("hi"," guys ","how are ");
	
}
}
