package com.xworkz.java.BasicJavaPrograms.ReverseNumber.UsingForloop;

public class ReverseNo2 {
	public static void main(String[] args) {
		int number=987654, reverse=0, remainder=number%10;
		for(;number!=0;) {
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			}
		System.out.println("The given reverse number is:"+reverse);
	}


}
