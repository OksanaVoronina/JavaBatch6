package com.syntax.class19;

public class Main {
	//Write a Java program called Teacher.
	//Identify features and behaviour of that Class.
	//Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
	//that would have it their own features and behaviour. Test all 4 classes 
	
		  static String name;
		  private String city;
		  String schoolName;
		  protected int batch;
		  
		  public static void displayAll(String city,int batch,String schoolName){
		    System.out.println(" My name is "+name+" and i live in "+
		    city+".I study at "+schoolName+" in batch "+batch);
		  }
		  public static void main(String args[]){
		    Main.name="Oksana";
		 
		    Main.displayAll("Chantilly", 6, "Syntax");
		    
		  }
		}

