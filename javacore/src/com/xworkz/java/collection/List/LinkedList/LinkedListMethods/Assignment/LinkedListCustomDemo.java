package com.xworkz.java.collection.List.LinkedList.LinkedListMethods.Assignment;

import java.util.LinkedList;

public class LinkedListCustomDemo {
	public static void main(String[] args) {
	
	
	
	Beer beer = new Beer();
	beer.setTaste(" good");
	beer.setPrice(180);
	beer.setColor("brown");
	
	Beer kf = new Beer();
	kf.setColor("yellowish");
	kf.setPrice(190);
	kf.setTaste("sour");
	
	LinkedList<Beer> ll = new LinkedList<Beer>();
     ll.add(kf);
	 ll.add(beer);
	 System.out.println(ll);
	 
	 for(Beer l1:ll) {
		 if(l1.getPrice()==180) {
			 System.out.println(l1);
		 }
		 
	 }
	}
}
