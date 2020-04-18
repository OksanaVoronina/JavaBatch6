package com.syntax.class27;

public abstract class Flower {

	public String type;
	
	public Flower(String type){
		this.type=type;
	}
	abstract void bloom();
}
class Tulip extends Flower{
	
	Tulip(String type){
		super(type);
	}
	void bloom() {
		System.out.println(type+" bloom in May");
	}
}
class Rose extends Flower{
	Rose(String type){
		super(type);
	}
	void bloom() {
		System.out.println(type+" bloom in June");
	}
}
class Sunflower extends Flower{
	Sunflower(String type){
		super(type);
	}
	void bloom() {
		System.out.println(type+" bloom in Agust");
	}
}

