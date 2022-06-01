package com.xworkz.java.Polymorphism.Methodoverriding;

public class MethodoverridingDemo {
	
	public static void main(String[] args) {
		
		RBI rbi = new RBI();
		HDFC hdfc = new HDFC();
		AXIS axis = new AXIS();
		
		hdfc.interestRate();
		axis.interestRate();
		rbi.interestRate();
	}

}
