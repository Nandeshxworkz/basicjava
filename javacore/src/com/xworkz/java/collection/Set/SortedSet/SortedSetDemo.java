package com.xworkz.java.collection.Set.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet<Object> ss = new TreeSet<Object>();
		ss.add(100);
		ss.add(101);
		ss.add(102);
		ss.add(103);
		ss.add(104);
		ss.add(105);
		ss.add(106);
		
		System.out.println(ss);
		
		System.out.println(ss.first());  //100
		System.out.println(ss.last());   //106
		System.out.println(ss.headSet(103)); //100,101,102
		System.out.println(ss.tailSet(104));//104,105,106
		System.out.println(ss.subSet(103, 105)); //103,104
		
	}

}
