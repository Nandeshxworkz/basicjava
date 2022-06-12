package com.xworkz.java.Abstraction.AbstractClass.AbstractClassExample.Assignment;

public abstract class Amazon {

	abstract void amazonpaying();
	
	void shoping() {
		System.out.println("Buy 1 get 1 free");
	}
}

class Amazonpay extends Amazon{
	
	void amazonpaying() {
		System.out.println("Scan and pay the money");
	}
	
	public static void main(String[] args) {
		Amazonpay amzn = new Amazonpay();
		amzn.amazonpaying();
	}
}
