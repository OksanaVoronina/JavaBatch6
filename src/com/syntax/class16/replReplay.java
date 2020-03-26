package com.syntax.class16;

public class replReplay {
	 public static  String censorLetter (String a,char b){
		  a=a.replace(b,'*');
		  return a;
		  }
		  public static void main(String args[]){
		   replReplay obj =new replReplay();
		   System.out.println(obj.censorLetter("computer science ",'e'));
		    System.out.println(obj.censorLetter("trick or treat ",'t'));
		    
		  }
		  
		}

