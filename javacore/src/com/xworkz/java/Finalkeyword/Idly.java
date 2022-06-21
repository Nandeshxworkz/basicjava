package com.xworkz.java.Finalkeyword;

public class Idly extends Food{
	
	String name="idly";
    String taste ="better";
    double price=25;
    
    Idly(){
    	System.out.println("idly taste is better than pulka");
    }
    
    Idly(String name, String taste){
    	System.out.println(name);
    	System.out.println(this.name);
    	System.out.println(super.name);
    	
    }
}

