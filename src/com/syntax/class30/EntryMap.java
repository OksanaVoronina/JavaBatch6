package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntryMap {
	  public static void main(String args[]){
		    Map<String,Integer> map=new HashMap<>();
		    map.put("mango",10);
		    map.put("apple",30);
		    map.put("orange",20);
		    map.put("mango",40);
		    map.put("mango",40);
		    Set<Entry<String,Integer>> ent= map.entrySet();
		    Iterator<Entry<String,Integer>>it=ent.iterator();
		   while(it.hasNext()){
		      System.out.println(it.next());
		    }
		    
		  }
}
