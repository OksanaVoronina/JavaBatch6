package com.syntax.class28;
import java.util.ArrayList;
import java.util.Iterator;
public class FoodTest {
public static void main(String[] args) {
	
	ArrayList<Food> list=new ArrayList<>();
	list.add(new Chikin());
	list.add(new Beef());
	list.add(new Pork());
	list.add(new Fish());
	System.out.println("======= for loop======");
	for(int i=0;i<list.size();i++) {
		list.get(i).bake();
		list.get(i).boild();
		list.get(i).cooked();	
	}
	System.out.println("======= for advence loop======");
for(Food f:list) {
	f.bake();
	f.boild();
	f.cooked();
}
System.out.println("======= usiing iterator======");
 Iterator<Food> food=list.iterator();
 while(food.hasNext()) {
 Food f=food.next();
   f.bake();
   f.boild();
   f.cooked();
 }
	
	
}
}
