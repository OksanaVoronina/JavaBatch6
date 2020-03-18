package com.syntax.class09;

public class NestedFor {

	public static void main(String[] args) {
		for(int i=0;i<=9;i++) {
			for(int a=0;a<=9;a++) {
				for(int b=0;b<=9;b++) {
					for(int c=0;c<=9;c++) {
						System.out.println(i+""+a+""+b+""+c);
					}
				}
			}
		}
	}

}
