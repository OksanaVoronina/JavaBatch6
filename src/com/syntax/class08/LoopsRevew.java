package com.syntax.class08;
import java.util.Scanner;
public class LoopsRevew {
public static void main(String args[]) {
	
	Scanner scan= new Scanner(System.in);
	double pay;
	
  // do {
	//  System.out.println("pay for candy");
	//pay=scan.nextDouble();

    // }while(pay !=2);
   
  /// System.out.println("enjoy your candy");
   //}
	System.out.println("---------2 way---------");
	
      System.out.println("pay for candy");
	   pay=scan.nextDouble();
	   
	   while(pay!=2){
		   System.out.println("pay for candy");
			pay=scan.nextDouble();
		   }
	   System.out.println("enjoy your candy");
}
 
}
