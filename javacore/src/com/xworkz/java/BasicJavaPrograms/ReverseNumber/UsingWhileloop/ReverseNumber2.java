package com.xworkz.java.BasicJavaPrograms.ReverseNumber.UsingWhileloop;

	public class ReverseNumber2 {
		public static void main(String[] args) {
			int number=98765, reverse=0, remainder=number%10;
			while(number!=0) { 
			     remainder = number%10;
		     	reverse=reverse*10+remainder;
		     	number=number/10;
		}
		     	System.out.println("The given reverse number is:"+reverse);
	}
	}


