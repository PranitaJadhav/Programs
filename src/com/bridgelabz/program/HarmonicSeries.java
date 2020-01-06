package com.bridgelabz.program;

public class HarmonicSeries {

	public static void main(String[] args) {

		float harmonic	=	1;
		System.out.println("Harmonic series is");
		 for(int i=2;i<=10;i++) {
			 
			 harmonic	=	harmonic + (float)1/i;
			 
			 System.out.println(+harmonic);
		 }
	}

}
