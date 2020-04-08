package com.syntax.class23;

public class Final {
	
		  
		  final void method( boolean a){
		    System.out.println("Final method with boolean parameter");
		  }
		 final void method(String a){
		    System.out.println("Final method with String parameter");
		    
		  }
		 public static void main(String args[]) {
			 
			 Final b=new Final();
			 b.method(true);
			 b.method(null);
		 }
}
