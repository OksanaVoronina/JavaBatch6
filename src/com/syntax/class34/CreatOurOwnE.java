package com.syntax.class34;

public class CreatOurOwnE {
		public static void grade(int grade){
		if(grade>90){
		throw new SyntaxStudentException("You are an exceptionally awsome student");
		}else{
		System.out.println("You are a great student");
		}
		}

public static void main(String[] args) {
	try {
			grade(91);
		} catch (SyntaxStudentException e) {
			System.out.println(e);
		}
}
	}

