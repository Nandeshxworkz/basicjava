package com.xworkz.java.instanceOf.Assignment.Example11;

public class Cafe {
	 
	Beverage vendingmachine(int choice) {
		if(choice == 1) {
			Coffee c= new Coffee();
			return c;
		}
		else if (choice==2) {
			Tea t = new Tea();
			return t;
		}
		else {
			return null;
		}
	}

}
