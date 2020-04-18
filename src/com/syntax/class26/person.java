package com.syntax.class26;


	class Person {
		  private String firstname,lastname;
		  private int birthmonth,birthday,birthyear;
		  private String ssn;

		Person(String  firstname,String lastname,int birthmonth,int birthday,int birthyear,String ssn){
		  this. firstname= firstname;
		  this.lastname=lastname;
		  this.birthmonth=birthmonth;
		  this.birthday=birthday;
		  this.birthyear=birthyear;
		  this.ssn=ssn;
		}
		public String getFname(){
		return  firstname;
		}
		public String getLname(){
		return lastname;
		}
		public int getBM(){
		return birthmonth;
		}
		public int getBD(){
		return birthday;
		}
		public int getBY(){
		return birthyear;
		}
		public String getSsn(){
		  return ssn;
		}
		public static void main(String args []){
		    Person obj=new Person("John","Doe",10,25,1900,"123-45-6789");
		    System.out.println(obj.getFname()+"\n"+obj.getLname()+"\n"+obj.getBM()+"\n"+obj.getBD()+"\n"+obj.getBY()+"\n"+obj.getSsn());
		  }
		}

