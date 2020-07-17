package com.syntax.claas01;
import static java.lang.System.out;

import java.util.Iterator;
import java.util.TreeSet;

public class JavaProgrammer {
	
 public static void main(String [] args) {
	 TreeSet map = new TreeSet();
	 map.add("one");
	 map.add("two");
	 map.add("three");
	 map.add("four");
	 map.add("one");
	 Iterator it = map.iterator();
	 while (it.hasNext() ) 
	 {
	 System.out.print( it.next() + " " );
	 }
 }
}