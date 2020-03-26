package com.syntax.class16;

public class MethodsRecap {

	public static int getLargest(int[] a) {
		int largest =a[0];
	for(int i =0;i<a.length;i++) {
		if(a[i]>largest) {
			largest=a[i];
		}
	}
	return largest;
	}
	String [] getWordsFromString(String str) {
		String [] array=str.split(" ");
		return array;
	}
	public static void main(String args[]) {
		MethodsRecap obj=new MethodsRecap();
		int[] arr= {10,20,30,40};
		System.out.println(obj.getLargest(arr));
		
		String myString="Its a beautiful day";
		String [] words=obj.getWordsFromString(myString);
		for(String letter:words) {
			System.out.println(letter);
		}
	}
	}
