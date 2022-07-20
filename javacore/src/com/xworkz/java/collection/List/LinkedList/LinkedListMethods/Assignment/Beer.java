package com.xworkz.java.collection.List.LinkedList.LinkedListMethods.Assignment;

public class Beer {
private	String taste;
private	double price;
private	String color;
	
  Beer(){
	  
  }

public String getTaste() {
	return taste;
}

public void setTaste(String taste) {
	this.taste = taste;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

@Override
public String toString() {
	return "Beer [taste=" + taste + ", price=" + price + ", color=" + color + "]";
}
  

	
}
