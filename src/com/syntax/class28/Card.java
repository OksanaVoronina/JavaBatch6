package com.syntax.class28;

public abstract  class Card {
//	Create a Card class that will have implemented 
	//and unimplemented methods and a constructor
	//that will initializes credit card type. 
	//Create 3 subclasses of a Card card. 
	String creditType;
	
	Card(String creditType){
		this.creditType=creditType;
	}
	public abstract void Apply();
	void CancelCard() {
		System.out.println(creditType+" has been canceled");
	
	}
}
class ABank extends Card{
	ABank(String creditType){
		super(creditType);
	}
	public void Apply() {
		System.out.println(creditType+" apply for credit card");
	}
	void CancelCard() {
		System.out.println(creditType+" has been canceled");
	}
}
class Suntrust extends Card{
	Suntrust(String creditType){
		super(creditType);
	}
	public void Apply() {
		System.out.println(creditType+" apply for credit card");
	}
	void CancelCard() {
		System.out.println(creditType+" has been canceled");
	}
}
class WellsFargo extends Card{
	WellsFargo(String creditType){
		super(creditType);
	}
	public void Apply() {
		System.out.println(creditType+" apply for credit card");
	}
	void CancelCard() {
		System.out.println(creditType+" has been canceled");
	}
}
