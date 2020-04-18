package com.syntax.class27;
import java.util.ArrayList;
import java.util.Iterator;
public class FlowerTest {
public static void main(String[] args) {
	

 Flower []FlowerArray={new Rose("Rose"),new Tulip("Tulip"), new Sunflower("Sunflower")};
 
 ArrayList<Flower> flower=new ArrayList<>();
 flower.add(new Rose("Rose"));
 flower.add(new Tulip("Tulip"));
 flower.add(new Sunflower("Sunflower"));
 
 System.out.println("====useing advanced for loop=======");

    for(Flower f:flower) {
     f.bloom();
	//1.  call available methods using: for loop, advanced for loop, iterator
     System.out.println("====useing for loop=======");
	 for(int i=0;i<flower.size();i++) {
		flower.get(i).bloom();
	 }
     System.out.println("====useing iterator=======");
     Iterator<Flower> flower2= flower.iterator();
     while(flower2.hasNext()) {
 		flower2.next().bloom();
 		
 	}
 }
}
}

