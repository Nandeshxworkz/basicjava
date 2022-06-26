package com.xworkz.java.Libraries1.hashcodeLibraries1.Assignment;

public class Car {
	
	public String hashcode() {
		return "Car Brand: "+"BMW";
	}
	
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.hashcode());
	}

}
