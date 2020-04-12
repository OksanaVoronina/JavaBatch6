package com.syntax.class25;

public abstract class Carr {
	
		//Create a Class Car that would have the following fields:
			//carPrice and color and method calculateSalePrice() 
			//which should be returning a price of the car.
			double carPrice;
			String color;
			
			Carr(double carPrice,String color ){
				this.carPrice=carPrice;
				this.color=color;
			
			
		}
			 abstract double calculatePrice();
		//Create 2 sub classes: Sedan and Truck.
			//The Truck class has field as weight and 
			//has its own implementation of  calculateSalePrice() 
			//method in which returned price calculated as following:
			//if weight>2000 then returned price car should include 10% discount,
			//otherwise 20% discount.
}
		 class Truck extends Carr{ 
			int weight;
			Truck(double carPrice,String color,int weight){
			   super(carPrice,color);
				this.weight=weight;
			}
			public double calculatePrice() {
				
				if (weight>2000) {
					carPrice-=carPrice*0.01;
					
				}else {
					carPrice-=carPrice*0.02;
						
				}
				return carPrice;
			}
			
		}
		//The Sedan class has field as length and also does it is own implementation
		//of calculateSalePrice(): if length of sedan is >20 feet then returned car 
		//price should include 5% discount, otherwise 10% discount
		 class Sedan extends Carr {
			int length;
			Sedan(double carPrice,String color,int length){
				super(carPrice, color);
				this.length=length;
			}
			public double calculatePrice() {
				double price=0;
				if (length>20) {
					double discount=carPrice*0.05;
					price=carPrice-discount;
				}else {
					double discount=carPrice*0.01;
					price=carPrice-discount;	
				}
				return price;
			}
			
		}	
		

