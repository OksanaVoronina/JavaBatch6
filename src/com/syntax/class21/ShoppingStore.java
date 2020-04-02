package com.syntax.class21;

public class ShoppingStore {
	
		  String item;
		  double price;
		  int quantity;
		  
		  ShoppingStore(String item,double price,int quantity){
		    this.item=item;
		    this.price=price;
		    this.quantity=quantity;
		    
		  }
		 public double itemTotalPrice(){
		    double value;
		    value=price*quantity;
		    
		    System.out.println(this.item+" Total Value "+value);
		    
		    return value;
		  }
		  
		}

