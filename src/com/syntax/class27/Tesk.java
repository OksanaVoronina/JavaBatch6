package com.syntax.class27;
import java.util.ArrayList;
import java.util.Iterator;

public class Tesk {
public static void main(String args[]) {
	//Create an arraylist of cars and retrieve all the values using 3 different ways.

	//Create an arrayList of words. Remove every word that ends with “e”. Use iterator	
ArrayList<String> cars=new ArrayList<>();
cars.add("Lexus");
cars.add("Jeep");
cars.add("Toyota");
cars.add("Volva");
cars.add("Aude");
System.out.println("=====first way======");
for(String car:cars) {
	System.out.println(car);
}
System.out.println("=====second way======");
System.out.println(cars);
System.out.println("=====third way======");
Iterator<String> list=cars.iterator();
while(list.hasNext()) {
	String list1=list.next();
	System.out.println(list1);
    	
    }
System.out.println("=====remove======");
Iterator<String> list1=cars.iterator();
    while(list1.hasNext()) {
    	String element =list1.next();
        if(element.endsWith("e")) {
        	list1.remove();
        	System.out.println("we removing "+element);
}
        System.out.println(element);
}
}
}

