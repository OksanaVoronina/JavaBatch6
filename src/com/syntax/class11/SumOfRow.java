package com.syntax.class11;

public class SumOfRow {
public static void main(String args[]) {
	
	int[][] a = {
			{1,1,2}, //sum = 4
			{3,1,2}, //sum = 6
			{3,5,3}, //sum = 11
			{0,1,2}  //sum = 3
	};
	int []sum=new int[a.length];
	int i;
	int x;
	
	for( i=0;i<a.length;i++) {
		int rowSum=0;
		for( x=0;x<a[i].length;x++) {
			rowSum+=a[i][x];
		}
	
		 sum[i]=rowSum;
	}
	for(int sums:sum) {
			System.out.println(sums);
	}
	}
}
	

