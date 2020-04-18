package com.syntax.class27;
import java.util.ArrayList;
import java.util.Iterator;
public class HomeWork {
	public static void main(String[] args) {
		
	
	

	//3. Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 

	//4. Create an arrayList of even numbers from 1 to 50. Using Iterator remove any number that is divisible by 5 from that arrayList.

	//5. look over LinkedList and Set Interface
	ArrayList<String> drink=new ArrayList<>();
	drink.add("juces");
	drink.add("vodka");
	drink.add("beer");
	drink.add("milk");
	
	for(int i=0;i<drink.size();i++) {
		if(drink.get(i).contains("a") ||drink.get(i).contains("e")  ) {
			drink.set(i,"water");
		}	
		
		}
	System.out.println(drink);
	System.out.println("=======second way=======");
	for (Iterator<String> it = drink.iterator(); it.hasNext();) {
		String x = it.next();
		if (x.contains("e") || x.contains("a")) {
			x = x.replaceAll(x, "Water");
		}
		System.out.println(x);
	}
		}
	}

