package com.xworkz.java.Libraries1.toString1;

public class Window {
	
	String type;
	double height;
	double width;
	
	Window(String type,double height,double width){
		this.type=type;
		this.height=height;
		this.width=width;
	}
	
	public String toString() {
		return type +" "+ height +" "+ width ;
		
	}

}
