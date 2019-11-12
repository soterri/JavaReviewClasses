package com.syntax.datatypes;

import java.util.Scanner;

public class SwitchStatemenTask {

	public static void main(String[] args) {
	
		//this exercise is not switch statement
	//task two find the largest number using nested if
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers for Nested If");
			
		double no1=scan.nextDouble();
		double no2=scan.nextDouble();
		double no3=scan.nextDouble();
		
		if(no1>no2) {
			if (no1>no3) { //no1>no2 && no1>no3
			System.out.println("Largest number is first -" +no1);
			
		}else { //assuming no2>no1
			
			if(no2>no3) { //no2>num1 && no2>no3 -- no 2 is largest
			System.out.println("Largest number is third " +no3);
		
		}
		}
	}
}
}
		
		
		

	


