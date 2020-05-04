package com.syntax.class30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MethodMap {
	  public void display(Map<String,Integer>map){
		  
	      if(!(map.isEmpty())){
	    	  Set<Entry<String,Integer>>entry=map.entrySet();
	        for(Entry<String, Integer> m:entry){
	          System.out.println(m);
	        }// or
            //for (String keys : map.keySet()) {
               // System.out.println (keys + " : " + map.get(keys));
             // }
	      }else{
	        System.out.println("map is empty");
	      }
	      
	    }
	    public static void main(String args[]){
	      Map<String,Integer> map=new HashMap<>();
	      map.put("mango", 10); 
	      map.put("apple", 30); 
	      map.put("orange", 20);
	    MethodMap map1=new MethodMap();
	    map1.display(map);
	     map.clear(); 
	     map1.display(map);
	         
	  }
	}

