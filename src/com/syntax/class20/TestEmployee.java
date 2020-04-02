package com.syntax.class20;

public class TestEmployee {
public static void main(String args[]) {
	Employee emp1=new Employee();
	ScrumTeam team=new ScrumTeam();
	ProductOwner owner=new ProductOwner();
	ScrumMaster master=new ScrumMaster();
	Developer dev=new Developer();
	Tester tester=new Tester();
	BussinessAnalyst ba=new BussinessAnalyst();
	
	emp1.numOfEmployee=123;
	emp1.salary=150.000;
	emp1.getPaid();
	
	team.ceremonies="Grooming";
	team.attendMeeting();
	team.getPaid();
	
	owner.ceremonies="Spring Meeting";
	owner.attendMeeting();
	owner.prioritizeBacklog();
	owner.salary=200.000;

	master.ceremonies="Spring planning";
	master.salary=180.000;
	master.navigateTeam();
	master.getPaid();
	master.attendMeeting();
	
	tester.test();
	tester.salary=120.000;
	tester.ceremonies="dayli stand-ups";
	
	
}
}
