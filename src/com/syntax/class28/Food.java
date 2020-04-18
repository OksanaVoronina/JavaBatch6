package com.syntax.class28;

public interface Food {
	//2.create food class that will have 3 undefined methods 
		//and it will have 4 subclasses; create a collection of food 
		//and using 3 ways execute methods
	void cooked();
	void bake();
	void boild();
}
 class Chikin implements Food{
	 
	public void cooked() {
		 System.out.println("Cooked chikin");
	 }
	public void bake(){
		 System.out.println("Baked chikin");
	 }
	 public void boild() {
		 System.out.println("Boild chikin ");
	 }
	 }
 class Beef implements Food{
	 
		public void cooked() {
			 System.out.println("Cooked Beef");
		 }
		public void bake(){
			 System.out.println("Baked Beef");
		 }
		 public void boild() {
			 System.out.println("Boild Beef ");
		 }
		 }
 class Pork implements Food{
	 
		public void cooked() {
			 System.out.println("Cooked Pork");
		 }
		public void bake(){
			 System.out.println("Baked Pork");
		 }
		 public void boild() {
			 System.out.println("Boild Pork");
		 }
		 }
 class Fish implements Food{
	 
		public void cooked() {
			 System.out.println("Cooked Fish");
		 }
		public void bake(){
			 System.out.println("Baked Fish");
		 }
		 public void boild() {
			 System.out.println("Boild Fish");
		 }
		 }
