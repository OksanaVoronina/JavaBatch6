package com.syntax.class06;
import java.util.Scanner;
public class SwitchWithString {
public static void main(String args[]) {
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Where are you from");
	String country=scan.next();
	
	
	String favoritFood=null;
	
	switch( country.toUpperCase()) {
	
	case "Ukraine":
		favoritFood="Borge";
		break;
	case "Turkey":
		favoritFood="Plov";
		break;
	default:
			favoritFood="unknow";
			break;
	}
	System.out.println(country +" Your favorit food is " + favoritFood);
}
}
