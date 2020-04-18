package com.syntax.class28;

import java.util.LinkedList;

public class FibonacciList {
	public static void main(String[] args) {
		int num=0;
	int one=1;
    int two;
	LinkedList<Integer> fib=new LinkedList<>();
	   for( int i=0;i<10;i++){
	      fib.add(num);
	      two=num+one;
          num=one;
          one=two; 
	   }
	   for(Integer f:fib) {
	    System.out.print(f+" "); 
	   }   
}
}
