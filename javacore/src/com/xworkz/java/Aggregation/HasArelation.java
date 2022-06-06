package com.xworkz.java.Aggregation;

public class HasArelation {
	public static void main(String[] args) {
		
		Human h1 = new Human();
		h1.heart = new Heart();
		h1.heart.heartbeat="72 per min";
		h1.heart.noofchambers=4;
		h1.hands=2;
		h1.legs=2;
		
		System.out.println("No of hands :"+h1.hands);
		System.out.println("No of legs :"+h1.legs);
		System.out.println("No of chambers in heart :"+h1.heart.noofchambers);
		System.out.println("Human common heartbeat rate :"+h1.heart.heartbeat);
	}

}
