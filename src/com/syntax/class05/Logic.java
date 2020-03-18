package com.syntax.class05;
import java.util.Scanner;
public class Logic {
 public static void main(String args[]) {
	 
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("How much is your sales?");
	 double sales=scan.nextDouble();
	 double commission=0;
	 if( sales> 1 && sales<=100) {
		 commission=sales *0.1;
		 }
	 else if (sales>100 && sales <=200) {
		 commission=sales *0.2;
	 }
	 else if (sales>100 && sales <=200) {
         commission=sales *0.3;
	 }
	 else {
		 commission=sales *0.5;
	 }
	 
    System.out.println(" your commission is " + commission);
    if (commission>100) {
    	System.out.println(" you are awesome");
    }
	 }

}