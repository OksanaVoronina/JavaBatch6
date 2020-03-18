package com.syntax.class10;

public class SumOfNum {
public static void main(String args[]) {
	
	//Create an array on integers and calculate the sum 
	//of all integer elements in an array.
	int [] num= {3,5,6,7,77,90};
	int sumOfNum=0;
	
	for(int nums:num) {
		sumOfNum+=nums;

		System.out.println(sumOfNum);
}
	// 2 way in 1 number of sum
	int sum=0;
	for(int i=0; i<num.length;i++){
		sum+=num[i];
	}
		System.out.println(sum);
	
		
		
	}
}
//}
