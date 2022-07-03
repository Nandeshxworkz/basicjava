package com.xworkz.java.Array.Assignment;

public class Lipstick {
	String name;
	String color;
    double price;
    
    
    
    public Lipstick(String name,String color,double price) {
    	this.name=name;
    	this.color=color;
    	this.price=price;
    }
    

	@Override
	public String toString() {
		return "Lipstick [name=" + name + ", color=" + color + ", price=" + price + "]";
	}

}
