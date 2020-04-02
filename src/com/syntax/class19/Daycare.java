package com.syntax.class19;

public class Daycare {
	//Write program for multilevel inheritance
	//where class A inherited by B and class B inherit class by C.
	static String name;
	String gender;
	int age;
	public void Takl() {
	System.out.println( name +" know how to talk");
}
	public  void Walk() {
		System.out.println(name+" know how to walk");
	}
	public class Child1 extends Daycare{

		String nationality;
		
		public  void Langauge() {
			System.out.println(name+" knows Hindy");
		}
		public void Age(int age1,int age2) {
			
			if(age1==age2) {
				System.out.println(name+" same age as ");
			}else {
				System.out.println(" they are different age");
			}
			
		}
	
	public class DaycareTest {

		public  void main(String args []) {
			
		Daycare kid1=new Daycare();
		kid1.name="Alex";
		kid1.gender="Boy";
		kid1.age=3;
		kid1.Takl();
		kid1.Walk();
	    
	    
		Child1 kid2=new Child1();
		kid2.name="Anika";
		kid2.gender="Girl";
		kid2.age=3;
		kid2.Takl();
		kid2.Walk();
		kid2.Age(3,3);
		kid2.Langauge();
		}
	}	
	}
}
