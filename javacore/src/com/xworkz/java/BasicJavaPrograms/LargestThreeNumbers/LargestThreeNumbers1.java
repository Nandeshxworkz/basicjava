package com.xworkz.java.BasicJavaPrograms.LargestThreeNumbers;

public class LargestThreeNumbers1 {
	public static void main(String[] args) {
		int x=10, y=50, z=20;
		if(x>=y&&y>=x)
			System.out.println("The largest  number is :"+x);
		else if(y>=z&&x<=y)
			System.out.println("The largest  number is :"+y);
		else
			System.out.println("The largest number is :"+z);
	}
	
}
