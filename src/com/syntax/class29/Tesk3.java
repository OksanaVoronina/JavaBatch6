package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

public class Tesk3 {
public static void main(String[] args) {
	//Create a Set collection that will hold Objects of Student Type.
	//In this set we do not care about the insertion order.
	//Each student object should have name and studentID. 
	//Display name of each student.
	
	HashSet<StudentType>obj=new HashSet<>();
	obj.add(new StudentType("Oksana",1243));
	obj.add(new StudentType("Den",16243));
	obj.add(new StudentType("Taras",12493));
	obj.add(new StudentType("Nikita",123));
	
	
	Iterator <StudentType> st=obj.iterator();
	while(st.hasNext()) {
		System.out.print( st.next().getName()+" ");
	}
	
	

}
}
