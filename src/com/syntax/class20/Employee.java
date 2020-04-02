package com.syntax.class20;

public class Employee {
static String company;
int numOfEmployee;
double salary;

void getPaid() {
	System.out.println("Employee geting paid "+ salary);
}
static void work() {
	System.out.println("Employee working at "+company);
}

}
class ScrumTeam extends Employee{
	
	String ceremonies;
	void attendMeeting(){
		System.out.println("ST is attending "+ ceremonies);
		work();
	}
	
}
