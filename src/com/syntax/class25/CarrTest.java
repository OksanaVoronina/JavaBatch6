package com.syntax.class25;

public class CarrTest {
public static void main(String[] args) {
	

	
	
	Carr c1=new Truck(250.00,"blue",100);
    Carr c2=new Sedan(300.00,"red",30);
    System.out.println(c1.calculatePrice());
    System.out.println(c2.calculatePrice());
}

}

