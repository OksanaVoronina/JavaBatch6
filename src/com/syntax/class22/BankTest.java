package com.syntax.class22;



public class BankTest {
public static void main(String[] args) {

	Bank bank=new Bank(900);
	double fee=bank.chargeFee();
	System.out.println(fee);

	
	BOA bao=new BOA(788);
	fee=bao.chargeFee();
	System.out.println(fee);
	
	TD td=new TD(188);
	fee=td.chargeFee();
	System.out.println(fee);
   
	PNC pnc=new PNC(902);
	fee=pnc.chargeFee();
	System.out.println(fee);
	
System.out.println("===========Task2");
task2 t=new task2();
t.calculate(2000, 0.1);

Visa visa=new Visa();
visa.calculate(100, 0.2);
}
}
