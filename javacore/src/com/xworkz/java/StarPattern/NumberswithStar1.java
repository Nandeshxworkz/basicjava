package com.xworkz.java.StarPattern;

public class NumberswithStar1 {
	int i,j;
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				
				if(j<=(5-i))
					System.out.print(j);
				else
					System.out.print("*");
			}
			int j = 5;
			j--;
			   while(j>0){
				   
		            if(j>5-i)  
		            System.out.print("*");  
		            else  
		            System.out.print(j);  
		            j--;
			
			}
			   System.out.println();
	}
	}
}
