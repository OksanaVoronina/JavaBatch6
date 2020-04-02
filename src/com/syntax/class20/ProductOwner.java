package com.syntax.class20;

 class ProductOwner extends ScrumTeam {
	 
void prioritizeBacklog() {
	System.out.println("Po prioritize Backlog");
}
	
}
 class ScrumMaster extends ScrumTeam {
	 void navigateTeam() {
		 System.out.println("SM navigate team");
		 
	 }
 }
 class Developer extends ScrumTeam{
	 void coding() {
		 System.out.println("Dev write code");
		 
	 }
 }
 class Tester extends ScrumTeam{
	 void test() {
		 System.out.println("Tester is testing");
		 
	 }
 }
 class BussinessAnalyst{
	 void workWithClaent(){
		 System.out.println("BA is working with claintes");
	 }
 }
