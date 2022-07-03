package com.xworkz.java.Array.Assignment;

public class JaggedArray {
	public static void main(String[] args) {
		int[][] jaggedarray = new int[3][];
		jaggedarray[0]=new int[2];
		jaggedarray[1]=new int[3];
		jaggedarray[2]=new int[4];
		
		int num=1;
			for(int i=0; i<jaggedarray.length; i++) 
			for(int j=0; j<jaggedarray[i].length;j++) 
				jaggedarray[i][j]= num++;
				
		for(int i=0; i<jaggedarray.length;i++) {
			for(int j=0; j<jaggedarray[i].length; j++) {
				System.out.print(jaggedarray[i][j]+" ");
				}
			System.out.println();
		}
	}

}
