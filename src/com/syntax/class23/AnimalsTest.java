package com.syntax.class23;

public class AnimalsTest {
	public static void main(String[] args) {

 		Animals animal=new Bird();
 		animal.sleep();
 		animal.whoAmI();
        //to print whoAmI from bird class we need to call in stat6ic way
 		Animals.whoAmI();
 		Bird.whoAmI();

 	}
 }


