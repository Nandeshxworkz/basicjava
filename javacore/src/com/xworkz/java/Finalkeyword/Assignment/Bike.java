package com.xworkz.java.Finalkeyword.Assignment;

public class Bike {
	
	final int speedlimit=90;     //  o/p is compile time error...
	
	void run() {
		speedlimit=400;
	}
	
	public static void main(String[] args) {
		Bike b = new Bike();
		b.run();
	}

}
