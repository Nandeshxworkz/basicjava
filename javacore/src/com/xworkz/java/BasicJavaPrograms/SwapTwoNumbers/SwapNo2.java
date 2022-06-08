package com.xworkz.java.BasicJavaPrograms.SwapTwoNumbers;

public class SwapNo2 {  //Without 3rd variable
	public static void main(String[] args) {
		int a=10, b=20;
	System.out.println(" Before Swapping");
	System.out.println(" Swapping of two numbers a:"+ a + " b:"+ b);
	            a=a+b;
	            b=a-b;
	            a=a-b;
		System.out.println(" After Swapping");
	    System.out.println(" Swapping of two numbers a:"+ a + " b:"+ b);
	}

}


