package com.bridgelabz.logicalprogram;


public class FlipCoin {

	public static void main(String[] args) {
		
		Utility1 utility	=	new Utility1();
		
		System.out.println("Enter the no of trial");
		
		int trial	=	utility.readInteger();
		
		double arr[]	=	utility.isFlip(trial);

		  System.out.println("head               "+arr[0]);
		  System.out.println("tail               "+arr[1]);

		  System.out.println("percentage of head "+arr[2]);
		  System.out.println("percentage of tail "+arr[3]);
		  
	}

}
