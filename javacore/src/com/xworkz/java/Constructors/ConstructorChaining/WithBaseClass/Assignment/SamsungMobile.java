package com.xworkz.java.Constructors.ConstructorChaining.WithBaseClass.Assignment;

public class SamsungMobile extends SamsungGroups{
	
	String model;
	String color;
	
	 SamsungMobile(){
		super("Sharat");
		System.out.println("new mobile launched");
		this.color="neavy blue";
		this.model="m20";
	 }
}
