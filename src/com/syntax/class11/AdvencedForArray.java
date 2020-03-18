package com.syntax.class11;

public class AdvencedForArray {
public static void main(String args []) {
	
	String[][] grocery= {
			{"Cucumber", "Potato", "Carrot"},
			{"Mango", "Apple", "Banana", "Kiwi"},
			{"Milk", "Cheese", "Yogurt"}
			};
	for (String[] row:grocery) {
		for(String col:row) {
		System.out.print(col+",  ");	
		}
		System.out.println();
	}
}
}
