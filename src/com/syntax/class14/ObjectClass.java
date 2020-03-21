package com.syntax.class14;

public class ObjectClass{

	String breed;
	String color;
	String name;
	int age;

	public static void main(String args []) {
		
		ObjectClass dog=new ObjectClass();
		dog.breed="Husky";
		dog.color="white";
		dog.name="Benge";
		dog.age=2;
		
		dog.eat();
		dog.bark();
		dog.run();
		
		ObjectClass dogTwo=new ObjectClass();
		dogTwo.breed="German Shepperd";
		dogTwo.color="black-brown";
		dogTwo.name="Rex";
		dogTwo.age=4;
		dogTwo.eat();
		dogTwo.bark();
		dogTwo.run();	
	}
	void eat() {
		System.out.println(name+ " can eat");
	}
	void bark() {
		System.out.println(name+" can bark");
	}
	void run() {
		System.out.println(name+" can run");
	}
	}


