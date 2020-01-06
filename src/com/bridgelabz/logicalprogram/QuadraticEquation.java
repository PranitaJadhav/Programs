package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class QuadraticEquation {
	
	public static void main(String[] args) {
		
		double root1,root2;
		Scanner sc	=	new Scanner(System.in);
		
		System.out.println("Enter the first point");
		int a	=	  sc.nextInt();
		

		System.out.println("Enter the second point");
		int b	=	  sc.nextInt();
		

		System.out.println("Enter the constant");
		int c	=	  sc.nextInt();
		
		
		double determinant	=	b*b-4*a*c;
		
		if( determinant>0) {
			
			root1	=	-b+Math.sqrt(determinant)/2*a;
			root2	=	-b+Math.sqrt(determinant)/2*a;
			
			System.out.println("Root1 is   "+root1+"Root2 is    "+root2);
			
		}
		
		else if(determinant  ==  0) {
			
			root1=root2	=	-b/2*a;
			
			System.out.println("Root is    "+root1);
			
		}
		else {
			
			double realPart	=	-b/2*a;
			double imaginary = Math.sqrt(-determinant)/2*a;
			
			System.out.println("Root1  "+realPart+imaginary+"Root2   "+realPart+imaginary);
			
			
		}
		
	
	}
   
    }
