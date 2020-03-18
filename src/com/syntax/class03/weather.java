package com.syntax.class03;
import java.util.Scanner;
class weather {
  public static void main(String args[]){
    
    Scanner scanner=new Scanner(System.in);
   
    System.out.println(" Is it sunny outside?");
   boolean isSunny=scanner.nextBoolean();
    System.out.println(" What is the temerature outside?");
    int tem=scanner.nextInt();
    
  if(isSunny==true){
    System.out.println("It is a sunny day, I should go somewhere!");
  
    if ( tem>=85){
    System.out.println("I am going to the beach");
    }
  
   else{
     System.out.println("I am goig to the park");
   }
  }
  else {
    System.out.println("I stay home and practice Java");
}
  }
}