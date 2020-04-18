package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {
	
public static void main(String[] args) {
	
	ArrayList<Double> alist=new ArrayList<>();
	alist.add(10.99);
	alist.add(9.99);
	alist.add(8.99);
	alist.add(7.99);
	
	System.out.println(alist.size());
	System.out.println(alist);
	alist.set(1, 13.90);
	System.out.println(alist);
	alist.remove(13.90);
	System.out.println(alist);
	
	System.out.println("================ITERATOR==================");
	
	Iterator<Double> iterator=alist.iterator();
	while(iterator.hasNext()) {
		Double d = iterator.next();
		System.out.println(d);
	}
	
	
	
	
	System.out.println("========NON GENERIC COLLECTION===========");
	
	//non generic ArrayList
	ArrayList obj = new ArrayList();
	obj.add("Hello");//store single object
	obj.add(100);//compiler allows this
	obj.add(6.99);//compiler allows this
	obj.addAll(alist);// store collection object
	
	System.out.println(obj);

	
}
}
