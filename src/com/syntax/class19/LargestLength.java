package com.syntax.class19;

public class LargestLength {
	public static String maxLength(String []arr ){
		  int larg=arr[0].length();
		  String large="";
		  for(int i=0;i<arr.length;i++){
		    if( arr[i].length()>larg) {
		    	larg=arr[i].length();
		    }
		    large+=larg;
		  
		  }
		  return large;
		}
		public static void main(String[] args) {
			
			String[] arr = {"hey","yolo","hi","this is long"};
		
			System.out.println(maxLength(arr));
			//should print "this is long"
		}
}
