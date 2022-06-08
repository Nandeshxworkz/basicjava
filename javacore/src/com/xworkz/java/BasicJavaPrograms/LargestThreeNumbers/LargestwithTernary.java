package com.xworkz.java.BasicJavaPrograms.LargestThreeNumbers;

public class LargestwithTernary {
	public static void main(String[] args) {
		int n1=2; 
		int n2=9;
		int n3=-11;
		//smallest=(n1>=n2)?((n1>=n3)? n1:n3) : ((n2<=n3)? n2:n3);
		// or another condition is=
		int smallest=(n1>=n2 && n1>=n3)? n1: (n2<=n3)?n2:n3;

		System.out.println(smallest);

	}

}
