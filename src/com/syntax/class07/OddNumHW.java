package com.syntax.class07;

import java.util.LinkedList;

public class OddNumHW {		
		
		  public static void main(String args[]){
			    LinkedList<Integer> value=new LinkedList<>();
			    value.add(111);
			    value.add(222);
			    value.add(333);
			    value.add(444);
			    value.add(555);
			    value.add(666);
			    int sum=0;
			    for(int i=0;i<value.size();i++){
			      sum+=value.get(i);
			    }
			    System.out.println("Result of sum is "+sum);
		  }
			  }
