package com.syntax.class27;
import java.util.Scanner;
import java.util.ArrayList;

	class ArrayScanner {
	public static void main(String args[]){
	  Scanner scan =new Scanner(System.in);
	  int num;
	  ArrayList<Integer> list=new ArrayList<>();
	  while(list.size()<=5) {
		 num =scan.nextInt(); 
		 list.add(num);
	  }
	   
	   for(Integer num1:list){
	     System.out.print(num1+" ");
	   }
	  }
	  }
	
	
	
	

