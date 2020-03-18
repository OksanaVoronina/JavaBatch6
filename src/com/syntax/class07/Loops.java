package com.syntax.class07;

public class Loops {
public static void main(String args[]) {
	

	int num1=1;
	while( num1<=20 ) {
		System.out.println(num1); // 1st way
	num1+=2;
		
	}
	int num2=1;
	while (num2<=20) {
		if (num2%2 !=0) {
		System.out.println(num2); //2stway
	     }
		num2++;
	
}
	int num3=1;
  while(num3<=20) {
		System.out.println(num3++); //3d way
		num3++;
	}
  int num5=1;
  for(num5=1;num5>51;num5++) {
		if(num5% 3==0) {
			continue;
		}
			System.out.println(num5);
}
}
}