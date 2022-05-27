package com.xworkz.java.StarPattern;

public class RightUPandDownPattern {
		public static void main(String args[]){


		for(int a=1; a<=4; a++){

		for(int b=3; b>=a; b--){
		System.out.print(" ");
		}
		for(int c=1; c<=a; c++){
		System.out.print("*");
		}
		System.out.println();
		}


		for(int i=1; i<=4; i++)
		{
          for(int j=2; j<=i; j++){
		    System.out.print(" ");
		}
		for(int k=4; k>=i; k--){
		System.out.print("*");
		}
		System.out.println();
		}
		}
		}

