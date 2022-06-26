package com.xworkz.java.instanceOf.Assignment.Example2;

public class Flipkart {
	
	Electronics shopping(int choice) {
		if(choice==1) {
			Laptop l = new Laptop();
			return l;
		}
		else if(choice==2) {
			Mobiles m = new Mobiles();
			return m;
		}
		else {
			return null;
		}
		
	}

}
