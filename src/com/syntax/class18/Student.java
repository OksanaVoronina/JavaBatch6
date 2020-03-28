package com.syntax.class18;

public class Student {
	//Write a java program of Class Students that takes students name
	//and 3 subject grades. Inside your class also have a method t
	//to Calculate Average Grade. Test Student class for 5 different students
	//with different marks. Your program should print an average mark 
	//of each students name.
	static String name;
	static int grade1,grade2,grade3;
	
	Student(String name1,int a,int b, int c){
		name=name1;// constructor will be executed every time you create object
		grade1=a;
		grade2=b;
		grade3=c;

	}
	public static int averageGrade () {
		int sum=grade1+grade2+grade3;
		int aver=sum/3;
	return aver;
		
	}
	
	public static void main(String args[]) {
		Student student1=new Student("oksana",100,89,98);
		System.out.println("student "+student1.name+" average is "+student1.averageGrade()+"%");

		
     Student student2=new Student("anna",76,89,88);
		System.out.println("student "+student2.name+" average is "+student2.averageGrade() +"%");

     
	}
	
}
