package com.syntax.class28;

public interface Insurance {

	public static final String insuranceName = "Atna";
	
	abstract void cancelInsurance();
	abstract void getQuote(); 
}
class Car implements Insurance{
	String carModel;
	Car(String carModel){
		this.carModel=carModel;
	}
	public void getQuote() {
		System.out.println(carModel+"insurence Qoute");
	}
	public void cancelInsurance() {
		System.out.println(carModel+"cancel insurance");
	}
}
class Pet implements Insurance{
	String petType;
	Pet(String carModel,String petType){
		super();
		this.petType=petType;
	}
	public void getQuote() {
		System.out.println(petType+"insurence Qoute");
	}
	public void cancelInsurance() {
		System.out.println(petType+"cancel insurance");
	}
}
class Health implements Insurance{
	
	Health(String carModel){
		super();
		
	}
	public void getQuote() {
		System.out.println("insurence Qoute");
	}
	public void cancelInsurance() {
		System.out.println("cancel insurance");
	}
}
