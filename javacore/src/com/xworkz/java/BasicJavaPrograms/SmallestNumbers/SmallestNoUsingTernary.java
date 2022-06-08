package com.xworkz.java.BasicJavaPrograms.SmallestNumbers;

public class SmallestNoUsingTernary {
	
	public static void main(String[] args) {
		int x=18, y=3, z=20;
		
		int smallest= (x>=y&&x>=z)?x:(y<=z)?y:z;
		System.out.println("The smallest number is:"+ smallest);
	}

}
