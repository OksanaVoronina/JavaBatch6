package com.syntax.class09;

public class NestedLoopFor {
public static void main(String args[]) {
	int b;
	for(int i=0;i<=24;i++) {  
	for(int a=0;a<=59;a++) {
		if(a<10) {
			System.out.println(i+":0"+a);
		}else {
		System.out.println(i+":"+a);
	}
	}
	}
}
}



