package com.syntax.class11;

public class task {
public static void main(String args[]) {
	
	String [][] cars= {{"Taoyta","BMW","Marcediz"},
			{"Jeep","Lezus","Bantle","Hunda"},
			{"Key","Fourd","Mazeraty"}};
	
	for(String []brands:cars) {
		for(String car:brands) {
			System.out.println(car);
		}
	}
	}
}

