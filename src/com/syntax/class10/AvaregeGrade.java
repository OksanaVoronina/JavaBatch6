package com.syntax.class10;

public class AvaregeGrade {
	public static void main(String[] args) {
		//what is average?
		int[] grades=new int[4];
		grades[0]=90;
		grades[1]=67;
		grades[2]=89;
		grades[3]=78;
		int average=(grades[0]+grades[1]+grades[2]+grades[3])/4;
		System.out.println("Average grade is "+average);
	}
}
