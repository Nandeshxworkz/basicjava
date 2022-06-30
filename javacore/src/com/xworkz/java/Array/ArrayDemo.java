package com.xworkz.java.Array;

public class ArrayDemo {
	public static void main(String[] args) {
		
		int[] arr=new int[4];
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		arr[3]=4;
		
		int num=1;
		for(int i=0; i<arr.length; i++) {
			arr[i]=num;
			num++;
		}
		
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	}
}
