package com.syntax.class12;
import java.util.Scanner;
public class TaskName {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("what is mom name");
		String momName=scan.next();
		System.out.println("What is dad name");
		String dadName=scan.next();
		System.out.println("Boy or Girl");
		String baby=scan.next();
		String babyName;
		String babyName1;
		
		if(baby.equalsIgnoreCase("Boy")) {
		babyName=dadName.substring(0,3);
		babyName1=momName.substring(4);		
			System.out.print(babyName+""+babyName1);
			
				
		}else {
			babyName=momName.substring(0,3);
			babyName1=dadName.substring(3);		
				System.out.print(babyName+""+babyName1);
				
				
		}
			
		}
		
	}


