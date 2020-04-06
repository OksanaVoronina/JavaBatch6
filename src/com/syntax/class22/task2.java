package com.syntax.class22;

public class task2 {
	//Create a class CreditCard and define variable balance and interest.
	//Create an instance method that will calculate interest based on the given balance. 
	//Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
	//Call the method by creating an object of each of the three classes.
	double balance;
	double interest;
	
	void calculate(double balance,double interest) {
		this.balance=balance;
		this.interest=interest;
		if(balance<1000) {
			interest=0.1;
		}else {
			interest=0;
		}
		System.out.println(" you being charge "+interest+" interest");
	}
}
class Visa extends task2{
	
	void calculate(double balance,double interest) {
		this.balance=balance;
		this.interest=interest;
		if(balance<1000) {
			interest=interest;
		}else {
			interest=0;
		}
		System.out.println(" you being charge "+interest+" interest");
	}
}
class AX extends task2{
	
	void calculate(double balance,double interest) {
		this.balance=balance;
		this.interest=interest;
		if(balance<1000) {
			interest=0.4;
		}else {
			interest=0;
		}
		System.out.println(" you being charge "+interest+" interest");
	}
}
