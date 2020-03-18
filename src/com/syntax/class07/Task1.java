package com.syntax.class07;

public class Task1 {
public static void main(String args[]) {
	
	 /*Create a boolean variable workDay and assign t
	rue create int variable day and assign it to 1
	●As long as it is workDay print “I needa day off” 
	and increase day.●Once day is 6
	print “I do not need aday off any more”
    */

boolean workDay=true;
int day=1;
 System.out.println("-------1 way------------");
 while(workDay && day!=6) {
	 System.out.println("i need day off");
	day++;
 }
    	System.out.println("I dont need day off");
    	
    	
    	System.out.println("---------2 way------------");

	boolean workDay1=true;
	int day1=1;
//}
	if(workDay1){
	while(day1<=6 ) {
		System.out.println("Ineed a day off");
		day1++;
	}
	System.out.println("i dont need off");
	}
	System.out.println("---------3 way----------");
	
	boolean workDay2=true;
	int day2=1;
	while(workDay2) {
		if( day2<6) {
			System.out.println("i need day off");
		}
		else {
			System.out.println("i dont need day off");
			workDay2=false;
		}
		day2++;
	}
}
}

