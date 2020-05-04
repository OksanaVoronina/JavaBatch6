package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class ToUpperCase {
	public static void main(String args[]){
		  Map<String,String> map=new HashMap<>();
		  map.put("Street","Patrick ST");
		  map.put("Suite","265");
		  map.put("City","Vienna");
		  map.put("Zip","22180");
		  map.put("Country","United State");
		  //Print all the values in upper case using entrySet 
		  
		 // Set<Entry<String,String>>set=map.entrySet();
		  
		  //or using collection
		  Collection<String>value=map.values();
		  for(String s:value){
			  String v=s.toUpperCase();
		    System.out.println(v);
		  }
		}
		}

