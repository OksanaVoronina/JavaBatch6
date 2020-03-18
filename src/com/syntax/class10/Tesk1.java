package com.syntax.class10;

public class Tesk1 {
public static void main(String args[]) {
	
	//Create an array of animals and store 6 elements into it.
	//Using 2 different loops print all elements from the array.
	
	String [] animals= {"Dog","cat","fish","sheep","monkey","bird"};
	
	for(int i=0;i<animals.length;i++) {
		System.out.println(animals[i]);
	}
	//2 way=========
	
	for(String animal:animals) {
		System.out.println(animal);
	}
	//3 way============
	int num=0;
	while(num<animals.length) {
		System.out.println(animals[num]);
		num++;
	
	}
	
	
}
}
