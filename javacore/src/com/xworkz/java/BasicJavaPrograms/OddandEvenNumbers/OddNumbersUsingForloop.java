package com.xworkz.java.BasicJavaPrograms.OddandEvenNumbers;

public class OddNumbersUsingForloop {
	public static void main(String[] args) {
		int number=100;
		System.out.println("Odd numbers from 1 to "+ number +":");
		for(int i=1; i<=100; i+=2) {
			//if(i%2!=0) {
				System.out.print( i + " ");
			}
		}
	}

//}
