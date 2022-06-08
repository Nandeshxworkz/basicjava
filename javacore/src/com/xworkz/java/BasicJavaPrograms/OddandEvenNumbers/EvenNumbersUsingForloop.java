package com.xworkz.java.BasicJavaPrograms.OddandEvenNumbers;

public class EvenNumbersUsingForloop {
	public static void main(String[] args) {
		int number=100;
		System.out.println("list of even numbers from 1 to"+ number +":");
		
		for(int i = 2; i<=number; i+=2) {
			System.out.print(i+" ");
		}
	}

}
