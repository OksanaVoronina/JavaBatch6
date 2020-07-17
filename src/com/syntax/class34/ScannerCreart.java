package com.syntax.class34;

import java.util.Scanner;

public class ScannerCreart {
	public static void main(String args[]){
	     Scanner scanner=new Scanner(System.in);
			    int tem;
			   try {
				  System.out.println("what is the temperature? : ");
			     temperature(tem=scanner.nextInt());
			} catch (RuntimeException r) {
				System.out.println(r);
			}
			  }
			  public static void temperature(int tem){
			    
			    if(tem<32){
			      throw new RuntimeException("It is freezing");
			    }
			  }
			}

