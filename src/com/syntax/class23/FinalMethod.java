package com.syntax.class23;

public class FinalMethod {
	

		public final String a(String b){
		  String newString="";
		  for(int i=b.length()-1;i>=0;i--){
		    newString+=b.charAt(i);
		  }
		  return newString;
		}
		public static void main(String args[]){
		  
		 FinalMethod print=new FinalMethod();
		 String newString= print.a("hello");
		  System.out.println(newString);
		}
		  
		}

