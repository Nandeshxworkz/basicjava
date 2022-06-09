package com.xworkz.java.Constructors.ConstructorChaining.WithintheClass;

public class Tiger {
	String name;
	String color;
	String gender;
	Tiger(){
		this("white", "rio", "male");

	}
	
	Tiger(String color, String name){
		this.color=color;
		this.name=name;
		System.out.println("Constructor with 2 parameterised");
			
	}
	
	Tiger(String color, String name,  String gender ){
		this("blck", "red");
		this.color=color;
		this.name=name;
		this.gender=gender;
		System.out.println("Constructor with 3 parameterised");
	}

}
