package com.bridgelabz.program;

public class PatternProgram {

	public static void main(String[] args) {
		int i,j;

		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++) {
				
				System.out.print(+j);
			}
		 
			System.out.println();
		
		}
		
		System.out.println("  1             **************                 ");
	// ******************************************************************************	
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++) {
				
				System.out.print("*");
			}
		 
			System.out.println();
		}
		
		System.out.println("    2           **************                 ");

//	2 *******************************************************************************
		
		for(i=1;i<=5;i++)
		{
			for(int k=4;k>=i;k--) {
				
				System.out.print(" ");
			}
					
					for(j=1;j<=i;j++) {
						
						System.out.print(+j);
					}
		 
			System.out.println();
		}
		System.out.println("   3            **************                 ");

	//**************************************************************************8
		for(i=1;i<=5;i++)
		{
			for(int k=4;k>=i;k--) {
				
				System.out.print(" ");
			}
					
					for(j=1;j<=i;j++) {
						
						System.out.print("*");
					}
		 
			System.out.println();
		}
		System.out.println("   4            **************                 ");

		
	//**************************************************************************8
		
		
		for(i=1;i<=5;i++)
		{
				for(j=1;j<=i;j++) {
						
					System.out.print("*");
				}
		 
			System.out.println();
		}
		
		for(i=1;i<=5;i++)
		{
					
					for(j=5;j>=i;j--) {
						
						System.out.print("*");
					}
		 
			System.out.println();
		}
		System.out.println("   5            **************                 ");

	
//*********************************************************************************
		for(i=1;i<=5;i++)
		{
				for(j=1;j<=i;j++) {
						
					System.out.print(+j);
				}
		 
			System.out.println();
		}
		
		for(i=1;i<=5;i++)
		{
					
					for(j=5;j>=i;j--) {
						
						System.out.print(+j);
					}
		 
			System.out.println();
		}
		System.out.println("        6       **************                 ");

		
//******************************************************************
		
		
		for(i=1;i<=5;i++)
		{
			for(int k=4;k>=i;k--) {
				
				System.out.print(" ");
			}
					
					for(j=1;j<=i;j++) {
						
						System.out.print("* ");
					}
		 
			System.out.println();
		}
		System.out.println("    7           **************                 ");

		
	//**************************************************************************8
			
		
		for(i=1;i<=5;i++)
		{
			for(int k=4;k>=i;k--) {
				
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
		System.out.println("    8           **************                 ");

	//**************************************************************************
		System.out.println();
		System.out.println();
		System.out.println();
		
		

		for(i=1;i<=4;i++)
		{
			for(int k=1;k<=i;k++) {
				
				System.out.print(" ");
			}
					
					for(j=4;j>=i;j--) {
						
						System.out.print("*");
					}
					
			
							for(int l=3;l>=i;l--) {
								
							   System.out.print("*");
								
							}
		 
			System.out.println();
	}
		System.out.println("               **************                 ");

//*************************************************************************	
		
		
}
  

}
