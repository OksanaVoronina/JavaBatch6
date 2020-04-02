package com.syntax.class21;

public class userClass {
	//Write program: userClass  that has a constructor
	//that initializes instance variable name and mobile number.
	// Create a subclass  userInfo that will have user address variable
	//and it also being initialized through constructor call. 
	//Print users name, mobile number and address in userDetails method. Test your code.
	String name,mobNum;
	userClass(String name,String mobNum){
	this.name=name;
	this.mobNum=mobNum;
	}
}
	class userInfo extends userClass{
	String address;
	
	userInfo(String name,String mobNum,String address) {
		super(name,mobNum);
		this.address=address;
		
	}	
	public void userDetails() {
		System.out.println(name+" "+mobNum+" "+address);
	}
	}

