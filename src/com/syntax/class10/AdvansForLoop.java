package com.syntax.class10;

public class AdvansForLoop {
	public static void main(String args[]) {
	char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F' };
	// getting all elements
	for (int i = 0; i < grades.length; i++) {
		System.out.print(grades[i] + " ");
		}
	System.out.println();
		
		System.out.println(" -- printing using advanced for loop --- ");
		for (char grade : grades) {
			System.out.print(grade + " ");
			}
		System.out.println();
}
}
