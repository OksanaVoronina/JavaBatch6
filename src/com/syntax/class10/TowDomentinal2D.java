package com.syntax.class10;

public class TowDomentinal2D {

	public static void main(String[] args) {
		
		
		String [][] month= {{"January","February","March"},
				{"April","May","Jun"},
				{"July","August","September"},
				{"October","November","Desember"}};
		
		int rows=month.length;
		int firstArray=month[0].length;
		
		System.out.println(rows);
System.out.println(firstArray);
for(int i=0;i<month.length;i++) {
	for(int a=0;a<month[i].length;a++) {
		System.out.println(month[i][a]);
	}
}
	}

}
