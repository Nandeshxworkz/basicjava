package com.xworkz.java.Libraries1.hashcodeLibraries1;

public class Employee {
	
	//@override
	public int hashcode() {
		return 1234;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		
		System.out.println(e.hashCode());
	}

}
