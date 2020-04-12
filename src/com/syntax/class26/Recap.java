package com.syntax.class26;

public class Recap {

	void add() {
		System.out.println("first method");
	}
}
	class Seconf extends Recap{
	void add() {
		System.out.println("ssecond method");
	}
	void plus() {
		this.add();
	}
	}
	

