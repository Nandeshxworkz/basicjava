package com.xworkz.java.StarPattern;

public class LeftUpandDownTriangle {
	public static void main(String[] args) {
	for(int a=1; a<=5; a++) {
		for(int b=1; b<=a; b++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	for(int i=1; i<=5; i++) {
		for(int j=4; j>=i; j--) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
