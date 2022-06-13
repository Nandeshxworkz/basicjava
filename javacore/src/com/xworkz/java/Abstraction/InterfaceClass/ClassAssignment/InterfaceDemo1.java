package com.xworkz.java.Abstraction.InterfaceClass.ClassAssignment;

public class InterfaceDemo1 {
	
	public static void main(String[] args) {
		Computer comp = new Computer();
		Sony sony = new Sony();
		Epson epson = new Epson();
		
		comp.slot(epson);
		comp.slot(sony);
	}

}
