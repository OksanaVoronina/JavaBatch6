package com.syntax.class23;

public class Main {
	
		public static void main(String[] args) {
			int[] a = {2,7,3,8,4};
			System.out.println(avgElements(a)); //should print 4.8
		}
		
		final static double avgElements(int a[]){
		double ab=0;
		double sum=0;
		for(int i=0;i<a.length;i++){
		  sum=sum+a[i];
		 ab=sum/a.length; 
		}
		 
		
		return ab;
		  
		}
	}

