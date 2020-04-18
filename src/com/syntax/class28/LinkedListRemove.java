package com.syntax.class28;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListRemove {


public static void main(String args[]){
		    LinkedList<Integer> num=new LinkedList<>();
		    for(int i=50;i<=100;i++){
		      num.add(i);
		    }
		   System.out.println(num);
		   System.out.println("====remove======");
		   Iterator<Integer>num2=num.iterator();
            while(num2.hasNext()) {	
            if(!(num2.next()%3==0)) {
            	num2.remove();
            }
            }
            System.out.println(num);
           
}
}

			
		
		
	

