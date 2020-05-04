package com.syntax.class30;

import java.util.*;


public class MapAndList {
	public static void main(String[] args) {
	//	Step 3: Add appleMap to dataList. 
		//Step 4: Create orangeMap<String, Object> and add below pairs into it. 
		//"Items", "Orange" 
		//"Price", 21.99
		//"Quantity", 10
		//Step 5: Add orangeMap to dataList. 
		//Step 6: Create a loop from dataList. 
		 
	List<Map<String,Object>> dataList=new LinkedList<>();
	Map<String,Object>appleMap=new LinkedHashMap<>();
	appleMap.put("Items", "Apple");
	appleMap.put("Price", 20.00);
	appleMap.put("Quantity", 10);
	//System.out.println(appleMap);
	dataList.add(appleMap);
	//System.out.println(dataList);
	
	Map<String,Object>orangeMap=new LinkedHashMap<>();
	orangeMap.put("Items", "Orange");
	orangeMap.put("Price", 21.99);
	orangeMap.put("Quantity", 10);
	dataList.add(orangeMap);
	//Iterator<Map<String, Object>> it=dataList.iterator();
	//Step 7: Retrieve each Key and store is in a variable. 
			//Step 8: calculate the subtotal of each object. 
			//Step 9: Print the values of each Iteration same as shown below in Output example. 
			//Step 10: Calculate the Sum of subtotal. and store is in variable called totalPurchase.
	double subTotal = 0;
	double purchaseTotalPrice =0;
	for(Map<String,Object>m:dataList) {
		Set<String> key=m.keySet();
				
    	Collection<Object> value =m.values();
         for(String v:key) {
        System.out.print(v+": "+m.get(v)+" ");
         
		}
         if( value.contains("Apple")) {
        	 subTotal=20.00*10.0;
             System.out.println("SubTotal "+subTotal+" ");

         }else {
        	 subTotal=21.99*10.0;
             System.out.println("SubTotal "+subTotal+" ");

         }
	}
	purchaseTotalPrice += subTotal; 
	
	System.out.println("Your Purchase total : " + purchaseTotalPrice);

		//Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0
		//Items: Orange Price: 21.99 Quantity: 10.0 SubTotal: 219.89999999999998
		//Your Purchase total : 419.9
		//System.out.println(key);
		
	  //System.out.println(value);
	    }
	}
	
	

