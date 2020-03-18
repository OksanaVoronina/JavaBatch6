package com.syntax.class03;

import java.util.Scanner;

class gender {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your age");
		int age = scanner.nextInt();
		System.out.print("Please enter your gender: M or F");
		char gender = scanner.next().charAt(0);

		if (age > 25 && gender == 'F') {
			System.out.println("women");
		}else if(gender!='F'){
			System.out.print("Man");
		
		}else {
			if (age < 25 && gender == 'F') {
			System.out.print("Girl");
		} else {
			System.out.print("Boy");
		}
	}
	}
}

