package com.syntax.class17;

public class MethodArray {
	//Create a method that will accept an array 
	//as parameters and will return a sum of all elements 
	//from that array. Method should be visibly only 
	//within same package and accessible by the creating 
	//an instance of the class.
	 protected  int accept (int[] num) {
	  int sum=0;
	  
	   for( int i=0;i<num.length;i++) {
    	sum+=num[i];
    	
    	 }
        return sum;
   }
   

		 public static void main(String args[]) {
		    	MethodArray obj=new MethodArray();
		    	int []arr={12,3,5,65,67};
		    
		 	   System.out.println(obj.accept(arr));

		    }
		}


