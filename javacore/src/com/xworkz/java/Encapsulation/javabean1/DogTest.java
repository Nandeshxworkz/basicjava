package com.xworkz.java.Encapsulation.javabean1;

public class DogTest {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.setName("Charlie");
		dog.setAge(24);
		dog.setColor("brown");
		dog.setDouble(1000.00);
		
		System.out.println("name :"+ dog.getName());
		System.out.println("Age :"+ dog.getAge());
		System.out.println("color :"+ dog.getColor());
		System.out.println("name :"+ dog.getDouble());
	}

}
