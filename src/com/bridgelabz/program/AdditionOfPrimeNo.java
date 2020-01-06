package com.bridgelabz.program;

public class AdditionOfPrimeNo {

	public static void main(String[] args) {
		
		int temp = 0,sum	=	0;
		
		for(int i= 2;i<=10;i++) {
			
			temp=0;
			
			for(int j = 2;j<i;j++) {
				
				
				if(i%j==0) {
					
					temp++;
					
					
				}
				
			}
				
				if(temp==0) {
					
					sum	=	sum+i;
				}
				
				
			
		}

		
		System.out.println(sum);
	}

}
