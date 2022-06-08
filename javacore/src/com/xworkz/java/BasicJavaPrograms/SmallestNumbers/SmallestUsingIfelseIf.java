package com.xworkz.java.BasicJavaPrograms.SmallestNumbers;

public class SmallestUsingIfelseIf {
	public static void main(String[] args) {
		
	int x=10, y=2, z=30;
	
	if(x>=y&&x>=z)
		System.out.println("1- The smallest number is:"+x);
	else if (y>=x&&y<=z)
		System.out.println("2- The smallest number is:"+ z);
	else
		System.out.println("3- The smallest number is:"+y);
	}

}
