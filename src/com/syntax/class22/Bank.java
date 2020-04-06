package com.syntax.class22;

public class Bank {

	double money,fee;
	
	 Bank(double money) {
		this.money=money;
	}
	double  chargeFee() {
		if(money<1000) {
			fee=money*0.1;
			//System.out.println(" you being charge "+fee+" fees");
		}else {
			fee=0;
			//System.out.println(" you are not charge %");

		}
		return fee;
	}
}
	
	class BOA extends Bank{
		
		BOA(double money){
			super(money);
		}
		double chargeFee(){
			if(money<1000) {
				fee=money*0.2;
			}else {
				fee=0;
			}
			return fee;
		}
	}
	class PNC extends Bank{
		PNC(double money){
			super(money);
			
		}
		double chargeFee() {
			if(money<1000) {
				fee=money*0.3;
			}else {
				fee=0;
			}
			return fee;
		}
	}
	class TD extends Bank{
		
		TD(double money){
		super(money);
	}
		double chargeFee() {
			if(money<1000) {
				fee=money*0.2;
			}else {
				fee=0;
			}
			return fee;
	}	
	}

