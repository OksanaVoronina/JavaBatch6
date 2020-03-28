package com.syntax.class17;

public class Main {
	static int countA(String s){
		  int count=0;
		  String letter="";
		  for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='A' || s.charAt(i)=='a'){
		    	String serch_term="";
		    	 String new_term="("+serch_term+")";
		    	 String bnewString =s.replace("serch_tern","new_tern");
		      count++;
		    }
		    			      
		       }
		 return count;

		}
			
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(countA("aaA")); //3
			System.out.println(countA("aaBBdf8k3AAadnklA")); //6
		}
	}

