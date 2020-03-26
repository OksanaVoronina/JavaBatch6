package com.syntax.class15;

public class SumEvenToX {
	 public static int sumEvenToX(int x){
		 
		 int sum=0;
		    for(int i=1;i<x;i++){
		      if(i%2==0){
		       sum+=i;
		     
		    }
		    }
			 return x=sum;
		  }
		  public static void main(String args[]){
			System.out.println("sumEvenToX ==> "+ sumEvenToX(5));
		  }
		}


