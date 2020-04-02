package com.syntax.class21;

public class Teacher {

	String name,lastName;
	
	//public Teacher() {
	//System.out.println("im parent constructor");
	//}
	public Teacher(String name,String lastName) {
		this.lastName=lastName;
		this.name=name;
	}
}
class MathTeacher extends Teacher{
	
	public MathTeacher(String name,String lastName) {
		super(name,lastName);
		//compiler will make call implicitly to parent class super()
	}
}
class JavaTeacher extends Teacher{
	String certif;
	JavaTeacher(String name,String lastName,String certif){
		super(name,lastName);
		this.certif=certif;
	}
}