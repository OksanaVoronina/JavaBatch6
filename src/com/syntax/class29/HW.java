package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HW {
public static void main(String[] args) {
	//Create a map of a building. Store floor number
	//and it is associated company name. 
	//(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values. 
	//Check how many entries you have?
	//Update company on a 4th floor 
	//Remove company on the 7th floor
	//Print your map
	Map<Integer,String>building=new LinkedHashMap<>();
	building.put(1,"Syntax");
	building.put(4,"Tyson");
	building.put(3,"Amazon");
	building.put(6,"Netflex");
	building.put(5,"Google");
	building.put(1,"Syntax");
	building.put(7,"Google");
	
	System.out.println(building.size());
	building.replace(4, "Netflex","Pops");
	System.out.println(building);
	building.replace(4, "Pops");
	System.out.println(building);
	building.remove(5);
	System.out.println(building.get(4));
	// put them to aphabet order by keys
	
	System.out.println(building.keySet());
	Map<Integer,String> a=new TreeMap<>(building);//or a.putAll(building);
	System.out.println(a);
	
	//to get all keys using iterator
	
	Set<Integer>keys=building.keySet();//this collection stores all keys
	
	Iterator <Integer>newkeys=keys.iterator();
	while(newkeys.hasNext()) {
		int key=newkeys.next();
		System.out.println(key+" and value is "+building.get(key));
	}
		//to get all keys using for loop,Set collection store all keys
   for(int k:keys) {
	   System.out.println(k+" and value is "+building.get(k));
   }
   Collection<String>values=building.values();
   System.out.println(values);
   for(String v:values) {
   System.out.println("values of collection is "+v);
   }
   Iterator<String> valuesIt=values.iterator();
  while(valuesIt.hasNext()){
	  String value=valuesIt.next();
	  System.out.println( "values of collection is "+value);
  }
}
}
