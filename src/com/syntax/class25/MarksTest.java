package com.syntax.class25;

public class MarksTest {
	public static void main(String args[]) {
	 Marks student1=new A(56,89,90);
	 double aver=student1.getPrecentage();
	 System.out.println("the average of student 1 "+aver);
	 
	 Marks student2=new A(90,89,100);
	 double aver2=student2.getPrecentage();
	 System.out.println("the average of student 2 "+aver2);
	}
}
