package com.syntax.datatypes;

public class Operators {

	public static void main(String[] args) {
	//Class notes.
    /* if number is between 1-10 -->this number is small
     * if number is between 10-100 --> this number is medium
     * if number is between 100-1000 --> this number is large
     * any other number --> is out of the range
     */
		
//  int num=200;
////        true AND false --> false
//  if (num>1 && num <10) {
//  System.out.println("this number is small");
//  // true AND false --> false
//  }else if (num>=10 && num<100) {
//  System.out.println("this number is medium");
//  //true AND true --> true
//  }else if (num>=100 && num <1000) {
//  System.out.println("this number is large");
//  }else {
//  System.out.println("Number is out of our the range");
//  }
		
		//write a prog to find if a number is even or odd
		//print out "my number must be even" or "my number must be odd"
		//or use else if
		
		int num=20;
		if (num%2==0) {
			System.out.println("my number must be even");
		}else {
			System.out.println("my number must be odd");
		}
		
		//Write a program to find if the largest Number of three numbers
	       //Print out  System.out.println("Largest number is " + largestNumber);
	        // Must use if then a else if and lastly else 
		int a, b, c;
		
		a=2;
		b=3;
		c=5;
		
		
		if(a>b && a>c) {
			System.out.println("The largest number is " +a);
		}else if (b>c && b>a) {
			
		}
		
			
			
			
		}
		
		
		
	}

