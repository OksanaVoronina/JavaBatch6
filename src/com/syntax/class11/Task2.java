package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
 
		String[][] countries= {{"Ukraine","Russian","Italy"},
				{"Brazil","USA","France","Germany"},
		{"Cuba","Iraq","Spain"}};
		int count=0;
		//for(String []city:countries) {
			//for(String country:city) {
			//	System.out.println(country);
				
			//}
			for(int i=0;i<countries.length;i++) {
				for(int a=0;a<countries[i].length;a++) {
					count+=1;
				}
			}
				System.out.println(count);;
				}
			
	}
		
	//}


