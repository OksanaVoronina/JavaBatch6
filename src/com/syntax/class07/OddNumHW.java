package com.syntax.class07;

public class OddNumHW {
	public static void main(String args[]) {
		
		int num=19;
		
		while( num<=50) {
			System.out.println(num);
			num+=2;
		}
	     int num2=19;
		System.out.println("---------2nd way---------");
		for(int i=19;i<=50;i+=2) {
			System.out.println(i);
		}
		
		System.out.println("---------3d way-------");
		int num3=19;
		
		do {
			System.out.println(num3);
			num3+=2;
		}
			while(num3<=50);
			}
	}


