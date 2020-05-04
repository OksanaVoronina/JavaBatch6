package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AllMap {
	public static void main(String[] args) {
		
	
	Map<String, Integer> grocery=new LinkedHashMap<>();
	grocery.put("milk", 1);
	grocery.put("cucumber", 3);
	grocery.put("banana", 12);
	grocery.put("cheese", 2);
	grocery.put("grapes", 3);
	System.out.println(grocery);
	
	System.out.println(grocery.keySet());//prints key set only in { }
	System.out.println(grocery.values());// prints values only in { }
	
	System.out.println("====iterate through all value in map===");
	Collection<Integer>value=grocery.values();
	for(Integer v:value) {
		System.out.print(v+" "+grocery.get(v));
	}// or get value using iterator
	Iterator<Integer> values=value.iterator();
	while(values.hasNext()) {
		Integer gros=values.next();
		System.out.print(gros+" ");
	}
	
	System.out.println("\n+++++iterate through all keys in map+++");
	Set<String> set=grocery.keySet();
	Iterator<String> it2=set.iterator();
	while(it2.hasNext()) {
		String gros=it2.next();
		System.out.print(gros+" "+grocery.get(gros)+" : ");
	}// or we can also use for loop
	
	System.out.println("\n=====Iterate all entery======");
	Set<Entry<String,Integer>> entry=grocery.entrySet();
	System.out.println(entry);
	Iterator<Entry<String,Integer>> entery=entry.iterator();
	while(entery.hasNext()) {
		Entry ent=entery.next();
		System.out.println(ent);
	}
	System.out.println("==========for loop======");
	for(Entry n:entry) {
		System.out.println(n);
	}
}
}
