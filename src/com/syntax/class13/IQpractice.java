package com.syntax.class13;
import  java.util.Scanner;
public class IQpractice {
public static void main (String args[]) {
	
	//1.Write a program to swap 2 numbers without a temporary variable? 
	//Swap  2 strings without a temporary variable?
	int c =10;
	int b=20;
	System.out.println("Value of a and b befor swapping, a:"+c
			+" b:"+c);
	c= c+b;
	b=c-b;
	c=c-b;
	System.out.println("Value of a and b after swapping, a:"+c
			+" b:"+b);
     
	String str1="Team";
	String str2="hey";
	System.out.println("String of str1 and str2 befor swapping: "+str1+" "+str2);
	str1=str1.concat(str2);
	str2=str1.substring(0,str1.length()-str2.length());
	str1=str1.substring(str2.length());
	System.out.println("String after swapping: "+str1+" "+str2);
	///or
	String s1="Hello";
		String s2="Bye";

		String shorterstr1 = s1+s2;
		s2 = shorterstr1.replace(s2, "");
		s1 = shorterstr1.replace(s2, "");

		System.out.println("The value of s1 = "+s1);
		System.out.println("The value of s2 = "+s2);
	
	System.out.println("===========2========");
    //2.Write a java program to check whether a given number 
	//is prime or not?prime num is a number that greater then 1 and
	//divisible by 1 and itself only2,3,5,7,11,17
	int give=6;
	boolean isPrime=true;
	if (give>1) {
		for(int i=2;i<give;i++) {
			if(give%i!=0) {
				isPrime=false;
				break;
			}
			}
		
	}
	System.out.println("giving num  "+give+" is "+isPrime);
	
	
	System.out.println("=========3=========");
	//3.Write a Java Program to print first 10 numbers of Fibonacci series.
	int n1=0;
	int n2=1;
	int n4;
	
	for( int i=1;i<=10;i++) {
		n4=n1+n2;
		System.out.print(" "+ n4);
		n1=n2;
		n2=n4;
	}
	System.out.println(" ");
System.out.println("==========4=========");
	//4.Find out how many alpha characters are present in a String? 
	//Find number of words in string?

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter string");
	String l = scan.nextLine();
	String n = l.replaceAll("[^A-Za-z]", ""); 
	//replacing everything except characters with "" -->(nothing)
	String p[] = l.split(" "); 
	// Dividing sentence by " "-->(Spaces)
	System.out.println("Characters in string = "+n.length());
	System.out.println("words in string = "+p.length);


	//===5. Write a java program to reverse String? ====
		//	Reverse a string char by char?
	String one="Good morning guys";
	System.out.println(one);
	char letter;
	for(int i=one.length()-1;i>=0;i--) {
       letter=one.charAt(i);
         System.out.print(letter);
	}
	System.out.println("");
 		//	Reverse a string word by word?
      String one1="Good morning guys";
    String []str=one.split(" ");
    for(int a=0;a<str.length;a++) {
    System.out.print(str[a]+" ");
   
    }
    System.out.println("");
    for(int i=str.length-1;i>=0;i--) {
    	System.out.print(str[i]+ " ");
 }

System.out.println("=============6===========");

      //6.Write a Java Program to find whether a String
         //is palindrome or not?
        // palindrome- is a word,phrase or sequence of word that reads the same 
        // backword as forword.

    String str4="Eva, can i see bees in cave?";
    str4=str4.replaceAll("[^A-Za-z]", "").replaceAll(" ", "").toLowerCase();
    String str5="";
    for(int i=str4.length()-1;i>=0;i--) {
    	str5+=str4.charAt(i);
    }
    	if(str4.equals(str5)) {
    	System.out.print("our sentence is palindrome ");
    }else {
    	System.out.print("our sentence is not palindrome ");

    
      //7.Write a java program to find the second largest number 
         //in the array? Maximum and minimum number in the array?
    
}
}
}