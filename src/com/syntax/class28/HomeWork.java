package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork{
	public static void main(String[] args) {
		
	
//Create 3 objects of the sub classes
	//and store them in ArrayList. Using for loop/advanced for loop/ 
	//iterator access all methods of the class.
		ArrayList<Insurance>list=new ArrayList<>();
		list.add(new Car("Lexus "));
		list.add(new Pet("lexus ","Rex "));
		list.add(new Health("Atna "));
		for(int i=0;i<list.size();i++) {
			list.get(i).cancelInsurance();
			list.get(i).getQuote();
		}
		for(Insurance lists:list) {
			lists.cancelInsurance();
			lists.getQuote();
		}
		System.out.println("=======");
		Iterator<Insurance> lists=list.iterator();
	   while( lists.hasNext()) {
		Insurance obj=lists.next();
		obj.cancelInsurance();
		obj.getQuote();
	   }
	   //dont have to call second time iterator to call method just creat obj 
	   
		//Iterator<Insurance> lists2=list.iterator();

	  // while( lists2.hasNext()) {
        // lists2.next().getQuote();
	   //}
		
	}	
}
