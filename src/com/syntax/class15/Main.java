package com.syntax.class15;

public class Main {
	
	 void input( String breed,String name){
	 System.out.println(breed+" can bark ");
	 System.out.println(breed+" can run ");
	 System.out.println(breed+" can play ");

	 }
		  void bark(){

		  }
		  void run(){

		}
		  void play(){
		  }
		
		public static void main(String args[]){
		  Main dog1=new Main();
		  dog1.input("Husky","white");
		  dog1.bark();
		  dog1.play();
		  dog1.run();
		  Main dog2=new Main();
		  dog2.input("Bukkdog","Rex");
		  dog2.bark();
		  dog2.play();
		  dog2.run();
		  Main dog3=new Main();
		  dog3.input("Labrador"," Coco");
		  dog3.bark();
		  dog3.play();
		  dog3.run();
		

	  }
		}
		

