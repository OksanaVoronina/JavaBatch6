package com.syntax.class08;

import java.util.Scanner;

public class Test4 {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		String item;
		int price;
		int change;
		int insertMoney=0;
		int more;
		int total=0;
		System.out.println("what you want to buy");
		item = scan.next();
		System.out.println(" how much");
		price = scan.nextInt();
		System.out.println("insert money");
			insertMoney = scan.nextInt();

		//while (insertMoney != price) {
			
			
			//if (insertMoney < price) {
				//more = price - insertMoney;
			//	System.out.println("add " + more + "$");
			//	more = scan.nextInt();
			//	 total=insertMoney+more;
				//if(total!=price) {
			//		
					//more=price-total;
			//		System.out.println("add more"+more);
			//		more=scan.nextInt();
					
			//	}	
					
			//	else{
			//		System.out.println("thank you");
			//		break;
			//	}
				
			//} else {
				//change = insertMoney- price;
				//System.out.println("your change is " + change+"$ thank you");
				//break;
			//}
			do {
				System.out.println("please give money");
				insertMoney=scan.nextInt();
				total=total+insertMoney;
				
				if(total<price) {
					more=price-total;
					System.out.println("add more "+more);
				}else if( total<price) {
					change=total-price;
					System.out.println(" your change is " +change);
					//break;
				}
				else {
					System.out.println("thank you");
				}
				}while(price<total);
			System.out.println("thank you for shopping");
				
			}
		}
	
	


