package com.bridgelabz.program;

public class ComplicatedPatternProgram {

	public static void main(String[] args) {
		
		int i,j,k;
		
		for(i=1;i<=5;i++)
		{
			for(k=4;k>=i;k--) {
				
				System.out.print("  ");
			}
					
					for(j=1;j<=i;j++) {
						
						System.out.print("* ");
					}
					
			
		for(int l=2;l<=i;l++) {
			
		   System.out.print("* ");
			
		}
		 
			System.out.println();
	}
		System.out.println();
		System.out.println();
		System.out.println();

		
		for(i=1;i<=5;i++) {
			
			for(j=1;j<=9;j++) {
				
				if(i+j==6  ||  j-i==4) {
					
					System.out.print("*");
				}
				
				else {
					
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();

		
		
		for(i = 1;i<=7;i++) {
			
			for( j=1;j<=7;j++) {
				
				if(i==1   || i==7 || j==1  ||  j==7 || i==j || i+j==8) {
					
					
					System.out.print("*");
				}
				
				else {
					
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();


		

		for(i = 1;i<=7;i++) {
			
			for( j=1;j<=7;j++) {
				
				if(i==4  ||  j==4  || i==1 || j==1 || j==7 || i==7 ) {
					
					
					System.out.print("*");
				}
				
				else {
					
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
}		
		
}		
		
		
		
		
		
