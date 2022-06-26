package com.xworkz.java.instanceOf.Assignment.Example11;

import java.util.Scanner;

public class Hadcandt {
	public static void main(String[] args) {
		
		Cafe c = new Cafe();
		Scanner s = new Scanner(System.in);
		
	    System.out.println("Enter choice:");
	    System.out.println("1:Coffe\n2:Tea");
	    int choice = s.nextInt();
	    
		Beverage obj = c.vendingmachine(choice);
		
		if(obj instanceof Coffee) {
			System.out.println("Drinking Coffee");
		}
		else if(obj instanceof Tea) {
			System.out.println("Drinking Tea");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
