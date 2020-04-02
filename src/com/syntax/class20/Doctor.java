package com.syntax.class20;

public class Doctor {

	int doctorId;
	String name;
public Doctor() {
	
}
	public Doctor(String name, int doctorId) {
		this.name = name;
		this.doctorId = doctorId;
	}
}

class Dentist extends Doctor {
	String lname;
	Dentist(String name,int doctorId,String lname) {
		//compiler will try to make call to parent class constructor super();
		super(name, doctorId);
		this.lname=lname;
	}

	public void display() {
		System.out.println("doctor name is "+name+" "+lname+ " and id is "+doctorId);
	}
	}// main method need to be in separate class

 class DoctorTest {
	
		
		public static void main(String args[]) {
			Doctor doc=new Doctor();
			Dentist den=new Dentist("oksana",6868,"voronina");
			den.display();
		}
		}

