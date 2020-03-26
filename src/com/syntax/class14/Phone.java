package com.syntax.class14;

public class Phone {

	String name;
	String color;
	int year;
	public static void main(String args[]) {
	Phone phone1=new Phone();
	phone1.name="Sumsung";
	phone1.color="red";
	phone1.year=2020;
	
	phone1.ring();
	phone1.call();
	phone1.text();
	
	Phone phone2=new Phone();
	phone2.name="iphone";
	phone2.color="blue";
	phone2.year=2010;
	
	phone2.ring();
	phone2.call();
	phone2.text();
	
}
void ring() {
	System.out.println(name+" can ring");
}
void call() {
	System.out.println(name+" can call");
}
void text() {
	System.out.println(name +" can text");
}
}
