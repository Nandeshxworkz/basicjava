package com.xworkz.java.Array.Assignment;

public class LipstickDemo {
	public static void main(String[] args) {
		
		Lipstick mac = new Lipstick("mac","pink",10.00);
		Lipstick maybeline = new Lipstick("maybeline","green",300.00);
		Lipstick lakme = new Lipstick("lakme","blue",5.00);
		Lipstick sugar = new Lipstick("sugar","white",20.00);
		Lipstick myglamm = new Lipstick("myglamm","red",50.00);
		
		Lipstick[] lipstick = {mac,maybeline,lakme,sugar,myglamm};
		
		for(int i=0; i<lipstick.length; i++) {
			if(lipstick[i].price<20.00) {
				System.out.println(lipstick[i]);
			}
		}

	}}

