package com.syntax.class06;
import java.util.Scanner;
public class AllInOne {
	public static void main(String args[]) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println(" is there sale?: True/False");
		 boolean sale=scan.nextBoolean();
		double price=0;
		double discount=0;
		double finalPrice=0;
		
		if ( sale==true) {
			System.out.println("what is the price of the item");
		    price=scan.nextDouble();
			double finalPrice1=0;
			if(price<=20) {
				discount=10;
				finalPrice=price*10/100;
				}
			else if( price>20 && price <100) {
				discount=20;
			   finalPrice= price *20/100;
			 
			}// you can do any way  price*0.2 or price*20/100
			else if(price> 100 && price<500) {  
				discount= price*0.3;
			}
			else {
				discount= price *0.5;
			}  
			finalPrice1= price-finalPrice;
		System.out.println(" after " + discount +"% " + " the price of item reduced from "
		+ price+  " to "+ finalPrice1);
		}
			else {
			System.out.println(" I am not goig to shop");
		}
			
	}
	
	
}
