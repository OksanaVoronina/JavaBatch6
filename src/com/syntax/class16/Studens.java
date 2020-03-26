package com.syntax.class16;

public class Studens {
	//Create a Class called Students
	//Create three  variables studentName , studentID  and numberOfStudents
	//Create three objects of the Students Class 
	//Set the value for  studentName , studentID and increment  the numberOfStudents for each object
	//Print out  total number of students
	String studentName;
	int studentID;
	static int numberOfStudens=0;
	
	public  Studens(String name,int id) {
	studentName=name;
	studentID=id;
	 numberOfStudens++;
}
	public static int getNumber() {
		return numberOfStudens;
	}
	public static void main(String args[]) {
		Studens name1=new Studens("Oksana",578889);
		Studens name2=new Studens("misha",578889);
		Studens name3=new Studens("boris",578889);


		System.out.println(Studens.numberOfStudens);
	}
}

