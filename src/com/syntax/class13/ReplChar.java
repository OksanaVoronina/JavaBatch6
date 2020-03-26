package com.syntax.class13;
import java.util.Scanner;
public class ReplChar {

	 public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    for(int i=0;i<word.length();i++){
		      char letter=word.charAt(i);
		      System.out.println(letter);
		    }
		  
		}
		}

