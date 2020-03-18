package com.syntax.class11;

public class TwoDNegatPOS {
	public static void main(String args[]) {
	int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
		int odd=0;
		int total=0;
		int negat=0;
		int i;
		int x;
		//for( i=0;i<a.length;i++){
		//  for( x=0;x<a[i].length;x+=2){
			 //if(a[i][x]<negat) {
			 // total+=1;
		 // }
		//  }
		//}
			 // System.out.println(total);
		
		  //} SECOND WAY
	int countNegative = 0;
	for (int j = 0; j < a.length; j++) {
		for (int c = 0; c < a[j].length; c++) {
			if (a[j][c] < 0 && a[j][c] % 2!=0) {
				countNegative = countNegative+c;
			}
		}
	}
 System.out.println(countNegative);
}
}


		  
		  
		  
		  
		 
	  
		
	
	


	

	

		

		
		

