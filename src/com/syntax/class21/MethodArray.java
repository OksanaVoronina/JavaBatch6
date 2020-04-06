package com.syntax.class21;

public class MethodArray{
	  static int a[][] ;
	  
	  public static int Sum(int a[][] ){
	  
	    int sum=0;
	    for(int i=0;i<a.length;i++){
	      for(int b=0;b<a[i].length;b++){
	       sum+=a[i][b]; 
	      }
	    }
	    
	  return sum;
	    
	  }
	  
	}
