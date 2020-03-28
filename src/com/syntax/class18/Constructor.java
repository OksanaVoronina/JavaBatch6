package com.syntax.class18;

public class Constructor {

	
    Constructor(){
	System.out.println("im constractor");
System.out.println("im non argument constractor");
    }
    Constructor(String str){
    	System.out.println("i am constractor with "+str);
    }
	
	
	
public static void main(String args[]) {
	Constructor car1=new Constructor();
	Constructor car2=new Constructor("hello");

}

}
