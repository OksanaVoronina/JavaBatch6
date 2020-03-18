package com.syntax.class10;
import java.util.Scanner;
public class MonthOfYear {
	  public static void main(String args[]){
		    Scanner scan=new Scanner(System.in);
		    String []month=new String[7];
		    int i;
		    for( i=0;i<7;i++){
		          System.out.println("Please enter day " + (i+1)+" of the week");
		          
		        String day=scan.next();
		      month[i]=day;
		    }
		    for(i=0;i<month.length;i++) {
		    	System.out.println(month[i]);
		    	
		    }
		  }
}
