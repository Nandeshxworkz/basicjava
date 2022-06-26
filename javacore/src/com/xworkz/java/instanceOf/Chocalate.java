package com.xworkz.java.instanceOf;

public class Chocalate extends Sweet{
	
	void mouth(Sweet sweet) {
		if(sweet instanceof Champakali) {
			System.out.println("wow... i got champakali");
		}
		
		else if(sweet instanceof Jalebi) {
			System.out.println("wow... i got jalebi");
		}
		
		else {
			System.out.println("i dont get any sweet");
		}
	}

}
