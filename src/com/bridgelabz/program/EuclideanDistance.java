package com.bridgelabz.program;

public class EuclideanDistance {

	public static void main(String[] args) {

		int x	=	Integer.parseInt(args[0]);
		int y	=	Integer.parseInt(args[1]);

		System.out.println(x);
		System.out.println(y);
		
		
		double distance;
		
		 
		distance	= Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));	

		System.out.println(distance
				);
	}

}