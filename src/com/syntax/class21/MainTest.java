package com.syntax.class21;

public class MainTest {
		  public static void main(String args[]){
		  ShoppingStore store1=new ShoppingStore("Blanket ",9.98,10);
		 double value1= store1.itemTotalPrice();
		  
		  ShoppingStore store2=new ShoppingStore("Mattress ",219.59,2);
		  double value=store2.itemTotalPrice();
		  double totalPrice=value1+value;
		  System.out.println(totalPrice);
		}
		}

