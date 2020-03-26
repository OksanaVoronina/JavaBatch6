package com.syntax.class15;

public class SpaceOut {
	 public static void spaceOut(String a){
		// char letter; 
		    for (int i=0;i<a.length();i++){
         System.out.print( a.charAt(i)+" ");


		    }
		  }
		  public static void main(String args[]){
			  SpaceOut b=new SpaceOut();
			  b.spaceOut("test");
		  }
		}

