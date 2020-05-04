package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class BrowserFile {
public static void main(String[] args) throws IOException {
	
	String filePath="/Users/oksanavoronina/eclipse-workspace/JavaBasics/configs/Browser.properties";
     
	FileInputStream ast=new FileInputStream(filePath);
	
	Properties prop=new Properties();
	prop.load(ast);
	
	Set<Object>set=prop.keySet();
	System.out.println(set);
	for(Object s:set) {// keys
		System.out.println(s);
	}
	Set<Entry<Object, Object>>obj=prop.entrySet();//entry
	for(Entry o:obj) {
	Object key=prop.keySet();
	Object value=prop.values();
	System.out.println(key+" : "+value);
	}
	Collection<Object>obj2=prop.values();// value
	System.out.println(obj2);
	
}
}
