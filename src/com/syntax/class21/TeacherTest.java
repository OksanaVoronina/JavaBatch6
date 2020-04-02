package com.syntax.class21;

public class TeacherTest {

	public static void main(String args[]) {
		MathTeacher math=new MathTeacher("oksana","voronina");
		System.out.println(math.name+" "+math.lastName);
		
		JavaTeacher java=new JavaTeacher("taras","bilii","c++");
	    System.out.println(java.name+" "+java.lastName);
	}
}
