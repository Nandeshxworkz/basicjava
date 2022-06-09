package com.xworkz.java.Constructors.ConstructorChaining.WithintheClass.Assignment;

public class Delllaptop {
	String color;
	String name;
	int ram;
	
	
	Delllaptop(){
		this("white", "dell", 8);
	}
	
	Delllaptop(String color, String name){
		
	    this.color=color;
	    this.name=name;
	    System.out.println("the laptop rent is high depend on proccesor");
	}
	
	Delllaptop(String color, String name, int ram){
		
		this.color=color;
		this.name=name;
		this.ram=ram;
		System.out.println("the laptop resolution is good");
	}

}
