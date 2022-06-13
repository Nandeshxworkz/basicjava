package com.xworkz.java.Abstraction.AbstractClass.AbstractClassExample.Assignment;



class Amazonpay extends Amazon{
	
	void amazonpaying() {
		System.out.println("Scan and pay the money");
	}
	
	public static void main(String[] args) {
		Amazonpay amzn = new Amazonpay();
		amzn.amazonpaying();
		amzn.shoping();
	}
}
