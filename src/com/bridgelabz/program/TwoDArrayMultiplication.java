package com.bridgelabz.program;
import java.util.*;

public class TwoDArrayMultiplication {

	public static void main(String[] args) {

		Scanner sc	=	new Scanner(System.in);
		
		System.out.println("Enter the 2d array size");
		
		int row	=	sc.nextInt();
		int column	=	sc.nextInt();
		
		System.out.println("Enter the array element");
		
			int aD[][]	=	new int[row][column]; 
			int bD[][]	=	new int[row][column]; 

			int cD[][]		=	new int[row][column];
			
			
			System.out.println("Enter the"+row*column+ "element of first array");
			
			 for(int i =0;i<row;i++) {
				 
				 
				 for(int j=0;j<column;j++) {
					 
					 aD[i][j]	=	sc.nextInt();
				 }
			 }
			 
			System.out.println("Enter the"+row*column+" element of first array");

			 	for(int i =0;i<row;i++) {
				 
				 
				 for(int j=0;j<column;j++) {
					 
					 bD[i][j]	=	sc.nextInt();
				 }
			 }
			 
			 
			 
		System.out.println("multiplication of 2d array");
			 
			 for(int i=0;i<row;i++) {
				 
				 for(int j=0;j<column;j++) {
					 
					 cD[i][j]	=	0;
					 
					 	for(int k=0;k<row;k++) {
					 		
					 		
					 		cD[i][j]	=	aD[i][k]*bD[k][j];
					 	}
					 	
					 	System.out.println(cD[i][j]);
				 }
				 
				 System.out.println();
			 }		 
	}

}
