package com.syntax.class34;

import java.util.Scanner;

public class ThrowsDemo {
public static void main(String[] args) {
		    Scanner scanner=new Scanner(System.in);
		    int tem;
		    temperature(tem=scanner.nextInt());
		  }
		  public static void temperature(int tem){
		    
		    if(tem<32){
		      throw new RuntimeException("It is freezing");
		    }
		  }
		}
