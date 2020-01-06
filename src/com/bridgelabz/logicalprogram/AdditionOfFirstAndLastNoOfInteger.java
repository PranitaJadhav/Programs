package com.bridgelabz.logicalprogram;

public class AdditionOfFirstAndLastNoOfInteger {

	public static void main(String[] args) {

		int n	=	567489;
		int temp=0,r=0;
		temp	=	n%10;

		while(n>0) {
			
			r	=	n%10;
			
			n	=	n/10;
			
		}

		
		int sum	=	temp+r;
		
		System.out.println(sum);
	}

}
