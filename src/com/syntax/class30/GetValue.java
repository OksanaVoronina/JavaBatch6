package com.syntax.class30;

import java.util.*;

public class GetValue {
	public static void main(String args[]){
		   
		   Map<String,String>map=new LinkedHashMap<>();
		   map.put("Street","Patrick ST");
		   map.put("Suit","265");
		   map.put("City","Vienna");
		   map.put("Zip","22180");
		   map.put("Country","United State");
		   
		   Collection<String>value=map.values();
		   Iterator<String>it=value.iterator();
		   while(it.hasNext()){
		     System.out.println(it.next());
		   }
		 }
		}

