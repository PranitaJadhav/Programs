package com.bridgelabz.program;

// Program to find the second smallest element in array

public class SecondSmallestInArray {

	public static void main(String[] args) {
		
		

		int arr[]	=	{2,3,5,6,1,-7};
		int secsmall	=	arr[0],small	=	arr[0];int i;
//		int max	=	Integer.MAX_VALUE;
//		int secsmall	= max;
//		int small	=	max;
//		
		  for( i	=	0;i<arr.length;i++) {
			  
			  if(arr[i]<small) {
				 
	//This gives us smallest element in array
				  
				  small	=	arr[i];
				  
			  }
		  }
		  
		  for( i	=	0;i<arr.length;i++) {
			  if(arr[i]<secsmall&&arr[i]!=small)
				  secsmall	=	arr[i];
		  
		  }
		  System.out.println("Smallest	"+small+"	second smallest	"+secsmall);
	}

}
