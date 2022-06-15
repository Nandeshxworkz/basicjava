package com.xworkz.java.typecasting.nonprimitivetypecasting.downcasting;

public class DownCastingDemo {
	
	public static void main(String[] args) {
		
		Bird bird = new Dove();   // parent reference is holding child object
		Dove dove = (Dove)bird; //down casting // giving of parent reference to child reference
	}

}
