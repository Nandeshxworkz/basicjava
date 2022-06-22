package com.xworkz.java.Encapsulation.javabean1;

public class Dog {
	private String name;
	private String color;
	private String breed;
	private int age;
	private double price;
	
	public void setName(String name) {
		this.name=name;
		}
	public String getName() {
		return name;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setDouble(double price) {
		this.price=price;
	}
	
	public double getDouble() {
		return price;
	}

}
