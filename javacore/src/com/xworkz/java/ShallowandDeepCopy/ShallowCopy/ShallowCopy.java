package com.xworkz.java.ShallowandDeepCopy.ShallowCopy;

public class ShallowCopy {
	
	public static void main(String[] args) {
		
		Shallow1 s = new Shallow1();
		Shallow1 s1 = s;
		
		s1.x= 90;
		s1.name="Heaven";
		
		System.out.println("the value of x is:"+ s.x);
		System.out.println("Name:"+ s.name);
	}

}
