package com.syntax.class05;
import java.util.Scanner;

public class Scorse {
public static void main(String args[]) {
	
	int score;
	int midTerm;
	char finalScores;
	
	Scanner scan= new Scanner(System.in);
	System.out.println("What is your score?");
	 score= scan.nextInt();
	 System.out.println("What is your min term score");
	 midTerm=scan.nextInt();
	
	if ( score>=90 && midTerm>=90) {
		finalScores='A';
	}
		else if (score>=70 && score<90 ) {
		finalScores='B';
	}
	
		else if ( score>=50 && score <70) {
			finalScores='C';
		}else {
			finalScores='F';
		}

		System.out.println(" your score is " + finalScores);
}
}

