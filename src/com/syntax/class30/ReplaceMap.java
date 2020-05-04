package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class ReplaceMap {
	 public static void main(String args[]){
		   Map<String,String>map=new HashMap<>();
		   map.put("ONE","AAA");
		   map.put("TWO","BBB");
		   map.put("THREE","CCC");
		   map.put("FOUR","DDD");
		   map.put("FIVE","EEE");
		   
		   Set<Entry<String,String>> entry=map.entrySet();
		   Iterator<Entry<String, String>>it=entry.iterator();
		   while(it.hasNext()){
		     Entry i=it.next();
		     System.out.println(i.getKey()+" : "+i.getValue());
		   }
		   map.replace("THREE", "Asel");
		   while(it.hasNext()){
			     Entry i=it.next();
			     System.out.println(i.getKey()+" : "+i.getValue());
			   }
		 }
		}

