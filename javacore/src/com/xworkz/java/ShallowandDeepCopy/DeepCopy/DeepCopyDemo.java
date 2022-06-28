package com.xworkz.java.ShallowandDeepCopy.DeepCopy;

public class DeepCopyDemo {
	public static void main(String[] args) {
		DeepCopy dc = new DeepCopy();
		DeepCopy dc1 = new DeepCopy();
		
		dc1.name="Bestfreind";
		
		System.out.println("Name:"+dc1.name);
		System.out.println("Name:"+dc.name);
	}

}
