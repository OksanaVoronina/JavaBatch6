package com.syntax.class12;

public class TaskStr {
public static void main(String args[]) {
	
	//Create a String and if the String is not empty
	//if the String has an odd number of characters 
	//and has 3 or more characters, print the character in the middle
	//of the String.
	String str="Good morning guys";
	boolean empty=str.isEmpty();
	int odd;
	if(!empty) {
		
		if(str.length()%2==1 && str.length()>=3) {
		System.out.println(str.substring(5,12))	;
		//or if you want to print just char
	System.out.println(str.charAt((str.length())/2));
	}
		
		
}else {
	System.out.println("String is empty");
}
		//========2 way========
		int length=str.length();
		if (length%2!=0) {
			char x=str.charAt(length/2);
			System.out.println(x);
		
	}
}
}
