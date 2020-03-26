package com.syntax.class17;

public class Employee {
	
protected String lastName;
public String firstName;
public static String title;
private long ssn;
double salary;// default

public static void method1() {
	System.out.println("im public method");
}
protected void method2() {
	System.out.println("im protected");
}
void method3() { // default 
	System.out.println("im difault");
}
private void method4() {
	System.out.println("im private ");
}
public static void main(String args[]) {
	Employee emp=new Employee();
	emp.firstName="oksana";
	emp.lastName="voronina";
	emp.salary=100.000;
	Employee title;
	
	Employee.method1();
	emp.method2();
	emp.method3();
		
}
}
