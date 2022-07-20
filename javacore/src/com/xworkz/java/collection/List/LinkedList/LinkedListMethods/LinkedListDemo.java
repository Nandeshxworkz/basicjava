package com.xworkz.java.collection.List.LinkedList.LinkedListMethods;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add("Hi sharat");
		ll.add(null);
		ll.add("java");
		ll.add("GeeksforGeeks sharat");
		
		System.out.println(ll);
		
		ll.addFirst("Sharat");
		System.out.println(ll);
		
		ll.addLast(1260);
		System.out.println(ll);
		
		System.out.println("------------");
		System.out.println(ll.getFirst());
		
		System.out.println("------------");
		System.out.println(ll.getLast());
		
		System.out.println("------------");
		System.out.println(ll.removeFirst());
		
		System.out.println("------------");
		System.out.println(ll.removeLast());
		
		System.out.println("------------");
		System.out.println(ll);
		
	}

}
