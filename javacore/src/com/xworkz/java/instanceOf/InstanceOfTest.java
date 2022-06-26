package com.xworkz.java.instanceOf;

public class InstanceOfTest {
	
	public static void main(String[] args) {
		Champakali champakali = new Champakali();
		Jalebi jalebi = new Jalebi();
		Chocalate chocalate = new Chocalate();
		
		chocalate.mouth(champakali);
		chocalate.mouth(jalebi);
		chocalate.mouth(null);
	}

}
