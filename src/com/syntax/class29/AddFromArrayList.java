package com.syntax.class29;
import java.util.ArrayList;
import java.util.Iterator;
public class AddFromArrayList {
	public static void main(String args[]){
	    ArrayList <Boolean> b=new ArrayList<>();
	    b.add(true);
	    b.add(false);
	    b.add(false);
	    
	    ArrayList<Boolean> b2=new ArrayList<>(b);
	    
	    Iterator <Boolean>it=b2.iterator();
	    while(it.hasNext()){
	      System.out.println(it.next());
	    }
	  }

	}

