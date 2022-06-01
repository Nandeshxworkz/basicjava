package com.xworkz.java.Polymorphism.MethodOverloading;

public class Human {
	void speak(Friend friend) {
		
		System.out.println("how are u ? bla... bla...!");
	}

	void speak(Unknown unknown) {
		System.out.println("How are u?");
	}
}
