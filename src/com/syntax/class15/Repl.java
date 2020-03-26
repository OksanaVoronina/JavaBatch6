package com.syntax.class15;

public class Repl {
	  void mult(int a,int b){
		     System.out.println("Multiplication "+ (a*b));
		   }
		   void add(int a,int b){
		     System.out.println("Addition "+(a+b));
		   }
		   void sub(int a,int b){
		     System.out.println("Subtraction "+(a-b));
		   }
		   public static void main(String args[]){
		     Repl call =new Repl();
		     call.add(15,15);
		     call.mult(3,10);
		     call.sub(50,20);
		   }

		}

