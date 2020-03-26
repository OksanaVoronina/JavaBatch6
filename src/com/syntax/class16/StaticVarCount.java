package com.syntax.class16;

public class StaticVarCount {
   String firstName;
   String lastName;
   static int members=0;
	public StaticVarCount(String fn,String ln) {
		 firstName=fn;
		 lastName=ln;
		 members++;
		 System.out.printf("Cpunter for %s %s,member in the club : %d\n ", 
				firstName, lastName,members);
	}
	public static int getMembers() {//to see total members come to club
		return members; 
	}
	public static void main(String args[]) {
		StaticVarCount member1=new StaticVarCount("megan","fox");
		StaticVarCount member2=new StaticVarCount("natalie","portman");
		StaticVarCount member3=new StaticVarCount("oksana","voronina");
	
		System.out.println(StaticVarCount.getMembers());// 3 members 
	}
}
