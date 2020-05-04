package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class Remove {
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
		   map.replace("THREE","ASEL");
		   Set<Entry<String,String>> entry2=map.entrySet();
		   Iterator<Entry<String, String>>it2=entry.iterator();
		   while(it2.hasNext()){
		     Entry i=it2.next();
		     System.out.println(i.getKey()+" : "+i.getValue());
		   }//or 
		   it=map.entrySet().iterator();  
	        while(it.hasNext()) {
	  			  Entry<String, String> entry3 = it.next();
	  			  String entryValue=entry3.getKey()+" : "+entry3.getValue();
	  			  System.out.println(entryValue);
	}
		 }
		}
