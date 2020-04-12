package com.syntax.class26;

public class Tesk1 {
//	Create Registration Class in which you would have variables 
	//as email, userName and password that have an access scope 
	//only within its own class. After creating an object of the 
	//class user should be able to call methods and in each method
	//separately pass values to set users email, username and password. 
	
	private String email,userName,password;
	
	
	
	
	public void setEmail(String email) {
		if(!email.isEmpty()) {
			if(email.contains("yahoo")) {
				this.email=email;	
			}
		}else {
			System.out.println("email cant be empty and should be yahoo");
		}
		
	}
	public void setUserName(String userName) {
		if(!userName.isEmpty() && userName.length()>6) {
         this.userName=userName;
         
		}else {
			System.out.println("userName cant be empty and should be less the 6 char");
		}
}
	public void setPassword(String password) {
		if(!password.isEmpty() && password.length()>6 && (!password.contentEquals(userName))) {
			
				this.password=password;			
		}else {
			System.out.println("password cant be empty and should be less the 6 char");
		}
		
}
	//Valid email consider to be only yahoo
	//Valid userName and password cannot be empty
	//and should be of length larger than 6 characters.
	//Also valid password cannot contain userName.
	public String getEmail() {
		
		return email;
}
	public String getUserName() {
		
		return userName;
	}
	public String getPassword() {
		
		return password;
	}
}






