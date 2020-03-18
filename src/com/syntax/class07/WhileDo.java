package com.syntax.class07;
import java.util.Scanner;
public class WhileDo {
public static void main(String args []) {
	
	String name;
	int num=1;
	Scanner scan =new Scanner(System.in);
	 while (num<5) {
		 System.out.println(" what is your name?");
		 name=scan.next();
		 System.out.println("Good afternoon" +name);
		 num++;
	 }
	
}

}
