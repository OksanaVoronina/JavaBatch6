package com.syntax.class16;

public class Employee {

	//Create a Class called Employee:
		//Create three  variables eID , salary and set the CEO to “Sumair” 
		//Create two objects of the class Employee 
		//Set the value of eID, salary for each of the objects
		//Print out the eID , salary and  CEO for each of the objects 
	int id;
	double salary;
	static String CEO="Sumair";


      void print1() {
    	  		
	System.out.println(" employee1 salary is "+ salary+
			  "id number is "+id+ " "+Employee.CEO);
      }
      void print2() {
    System.out.println(" employee2 salary is "+salary+
      		  "id number is "+id+ " "+Employee.CEO);

}
      public static void main(String args[]) {
    	  Employee employee=new Employee();
    	  employee.salary=100.00;
  	  	employee.id=127654;
  	  			    employee.print1();


  		Employee employee1=new Employee();
 		 employee1.salary=600.00;
		employee1.id=1654;
    	employee1.print2();

    		
      	  
      }
}