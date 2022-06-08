package com.xworkz.java.BasicJavaPrograms.LargestThreeNumbers;

public class LargestwithNestedif {       //Using Nested if
	public static void main(String[] args) {
		int a=100, b=10, c=50;
		
		if(a<=c) {
			if(b>=c)
				System.out.println("1- The largest no is:"+c);
			else
				System.out.println("2- The largest no is:"+b);
		}
		
		else {
			if(c<=b)
				System.out.println("3- The largest no is:"+c);
			else
				System.out.println("4- The largest no is :"+a );
		}
	}

}
