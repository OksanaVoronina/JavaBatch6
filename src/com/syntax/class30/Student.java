package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Student {
	
		 public String name,lastName,studentId;
		  
		 public  Student(String name, String lastName,String studentId){
		    this.name=name;
		    this.lastName=lastName;
		    this.studentId=studentId;
		} 
		public void display(){
			
		System.out.println("Student details: "+name+" "+lastName+" with id: "+studentId );
		
		}
		
public static void main(String args[]){
	   Set<Student> dis=new LinkedHashSet<>();
	   dis.add(new Student("Samir "," Jawaid "," 101"));
	   dis.add(new Student(" Asel "," Umurzakova "," 102"));
	   dis.add(new Student("Diego  "," Juarez"," 103"));
	   dis.add(new Student("Sohil"," Aryan"," 104"));
	   dis.add(new Student("Alijon"," Nazarov"," 105"));
	   
	for( Student b:dis) {
		b.display();
	  }
	 }
	}

