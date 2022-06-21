package com.xworkz.java.blocks.iib;

public class Television {
	String brand;
	int price;
	String type;
	String dimensions;
	
	
	Television(){
		System.out.println("constructor");
		
	}
	
	{
		System.out.println("1st iib");
		this.brand="mi";
		this.price=10000;
		this.type="LED";
		this.dimensions="45 inches";
	}
	
	{
		System.out.println("2nd iib");
		this.brand="sony";
		this.price=20000;
		this.type="LCD";
		this.dimensions="55 inches";
		
	}

}
