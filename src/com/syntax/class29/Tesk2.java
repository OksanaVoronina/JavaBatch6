package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Tesk2 {
public static void main(String[] args) {
	//Create a Set of cities in which you want to make
	//sure that insertion order is maintained. Using Iterator
	//remove any city that starts with “A”;
	
	LinkedHashSet<String> city=new LinkedHashSet<>();
	city.add("Dnepr");
	city.add("Amsterdam");
	city.add("Arlington");
	city.add("Fairfax");
	
	Iterator <String> newCity=city.iterator();
	while(newCity.hasNext()) {
		String b=newCity.next();
		if(b.startsWith("A")){
			newCity.remove();
		}
	}
	System.out.println(city);

	
}
}
