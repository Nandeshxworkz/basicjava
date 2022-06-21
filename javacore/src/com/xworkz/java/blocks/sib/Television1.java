package com.xworkz.java.blocks.sib;

public class Television1 {
	
	String brand;
	int price;
	String type;
    String dimensions;
    static String name;
    static String brand1;
	
	
	Television1(){
		System.out.println("constructor");
		
	}
	
	{
		System.out.println("1st iib");
		this.brand="sony";
		this.price=100000;
		this.type="LED";
		this.dimensions="45 inches";
	}
	
	static{
		System.out.println("2nd sib");
		name="micromax tv";
		brand1="micromax";
	}

}


