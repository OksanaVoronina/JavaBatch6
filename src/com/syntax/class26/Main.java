package com.syntax.class26;

class Main implements Functions {

	public void display(double result){
		
		System.out.println("Result is :: "+result);
	}
	
	public double adding(double firstNumber,double secondNumber){
		double result=0;
	  this.display(firstNumber+secondNumber );
	  return result;
	  
	   
	 
	       
	     }

	 
	  public double subtracting (double firstNumber,double secondNumber) {
		  double result =0;
		  this.display(firstNumber-secondNumber );
		   return result;
		  
		       
		     }
	  
	  public double multiply (double firstNumber,double secondNumber) {
		  
		   double result=0;
		   this.display(firstNumber*secondNumber);
		   return result;
		  
		       
		     }
	   
	  public double dividing (double firstNumber,double secondNumber) {
		  
		  
		  double result=0;
		  this.display(firstNumber/secondNumber);
		   return result;
		  
		      
	   }
	  
	  public static void main(String args[]){
		  double firstNumber=100.00;
			double secondNumber=20.00;
			Main obj=new Main();
			obj.adding(firstNumber,secondNumber);
			obj.subtracting(firstNumber,secondNumber);
			obj.multiply(firstNumber,secondNumber);
			obj.dividing(firstNumber,secondNumber);
	  }
			 }
	

	   
		 	

	