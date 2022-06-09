package com.xworkz.java.Constructors.ConstructorChaining.WithBaseClass;

public class TataMotors extends TataGroups {
	
	String model;
	String color;
	
	TataMotors(){
		super("TataRatan");
		System.out.println("Constructed TataMotors object");
		this.color="red";
		this.model="RangeRover";
	}
	

}
