package com.xworkz.java.BasicJavaPrograms.ReverseNumber.UsingWhileloop;

public class ReverseNumber1 {
	public static void main(String[] args) {
		int number=54321, reverse=0;
		
		while(number!=0) {
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		System.out.println("The given reverse number is:"+ reverse);
	}

}



