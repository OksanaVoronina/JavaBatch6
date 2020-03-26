package com.syntax.class15;

public class Methods {

	void sayWelcome() {
		
		for(int i=0;i<10;i++) {
			System.out.println("Welcome");
		}
	}
	void sayAnything(String word,int time) {
		for(int i=0;i<=time;i++) {
			System.out.println(word);;
		}
	}
	void isItRaining(boolean isRain) {
		if(isRain) {
			System.out.println("stay home");
		}else {
			System.out.println("go out side");
		}
	}
	public static void main(String[] args) {
Methods obj =new Methods();
obj.sayWelcome();
obj.sayAnything("Hello",2);
obj.isItRaining(true);
obj.isItRaining(false);
	}

}


