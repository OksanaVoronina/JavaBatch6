package com.syntax.class11;
import java.util.Scanner;
public class StringDemo {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("what is your user name");
		String username=scan.next();
		System.out.println("what is your password");
		String password=scan.next();
		System.out.println("confirm password");
		String confirm=scan.next();
		
		//boolean empty=true;
		if (username.isEmpty() || password.isEmpty()) {
		System.out.println("username and pasword is empty");
		}
		else if (password.length()< 8 ) {
			System.out.println("password is to short");
		}
			else if(username.equals(password)) {
				System.out.println("password cannt contain username ");
			}
			else if(password.trim().contentEquals(confirm)) {
				System.out.println("password do not match");
		}
			else {
				System.out.println("your username and password has been created");
			}
			
		}
	}

