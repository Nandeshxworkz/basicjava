package com.xworkz.java.instanceOf.Assignment.Example2;

public class Ordered {
	public static void main(String[] args) {
		
		Flipkart f = new Flipkart();
		Electronics objt=f.shopping(3);
		
		if( objt instanceof Mobiles) {
			System.out.println("i purchased mobiles");
		}
		else if( objt instanceof Laptop) {
			System.out.println(" i purchased laptops");
		}
		else {
			System.out.println("i am not purchasing anything");
		}
		
	}

}
