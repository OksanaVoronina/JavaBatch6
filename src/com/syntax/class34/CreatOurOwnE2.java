package com.syntax.class34;

class SyntaxStudentException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SyntaxStudentException(String massege){
		 super(massege);
	}
}
  public class CreatOurOwnE2{
		public static void grade(int grade){
		if(grade>90){
		throw new SyntaxStudentException("You are an exceptionally awsome student");
		}else{
		System.out.println("You are a great student");
		}
		}
		public static void main(String args[]) {
			grade(99);
		}
}

