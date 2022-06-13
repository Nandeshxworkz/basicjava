package com.xworkz.java.Abstraction.InterfaceClass.Assignment.Assignment1;

public class InterfaceDemo2 {
	
	public static void main(String[] args) {
		ATMmachine atm1 = new ATMmachine();
		DebitCard1 dbt1 =  new DebitCard1();
		DebitCard2 dbt2 =  new DebitCard2();
		DebitCard3 dbt3 =  new DebitCard3();
		
		atm1.insert(dbt1);
		atm1.insert(dbt2);
		atm1.insert(dbt3);
	}

}
