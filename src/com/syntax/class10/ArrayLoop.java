package com.syntax.class10;

public class ArrayLoop {
public static void main(String args[]) {
	
	String [] fruits= {"Apple","Mango","Bannana"};
	
	for(int i=0;i<fruits.length;i++) {
		System.out.println(fruits[i]);
	//}
		System.out.println("++++++++==========+++++++");
	for(String fruit:fruits) {
		System.out.println(fruit);
		
		System.out.println("+=============+");
		
		for(String fruit1:fruits) {
			if(fruit1.equals("Apple")) {
				System.out.println(fruit1+" its your favorit fruit");
			}else {
				System.out.println(fruit1);
			}
		}
	}
}
}
}
