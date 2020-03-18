package com.syntax.class08;

public class BreakAndContinue {
	public static void main(String aegs[]) {
		
		for(int i=0;i<=10;i++) {
			
			if(i==4) {
				System.out.println("i am stopping loop");
				break;
			}
			System.out.println("i am out of loop");
			System.out.println(i);
		}
		System.out.println("======countinue=====");
		
		for(int a=0;a<=10;a++) {
			
			if(a==5 || a==8) {
				System.out.println("hi");
			}
			System.out.println(a);
		}
		for(int x=0;x<=50;x++) {
			if(x>=20 && x<=27) {
				continue;
			}
				System.out.println(x);
			}
		}
		
		
		
		
	}


