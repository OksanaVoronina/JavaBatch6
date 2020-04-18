package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
public static void main(String[] args) {
	
	HashSet<String>breakfast= new HashSet<>();
	breakfast.add("eggs");
	breakfast.add("bread");
	breakfast.add("tea");
	breakfast.add("cream cheese");
	breakfast.add("eggs");
	breakfast.add("coffee");

	System.out.println(breakfast.size());
    System.out.println(breakfast);

    for(String b:breakfast) {
    	System.out.println(b);
    }
    	System.out.println("=======Iterator=====");
    Iterator <String>myIter=breakfast.iterator();
    	while(myIter.hasNext()) {
    	System.out.println(myIter.next());
    	}
    }
	
}

