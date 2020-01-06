package com.bridgelabz.program;

public class SecondLargest {


	

		public static void main(String[] args) {

			int arr[]	=	{2,3,5,6,1,7};
			int seclarg	=	arr[0], larg	=	arr[0];int i;
//			int max	=	Integer.MAX_VALUE;
//			int secsmall	= max;
//			int small	=	max;
//			
			  for( i	=	0;i<arr.length;i++) {
				  
				  if(arr[i]>larg) {
					  
					  larg	=	arr[i];
					  
				  }
			  }
			  
			  for( i	=	0;i<arr.length;i++) {
				  if(arr[i]>seclarg&&arr[i]!=larg)
					  seclarg	=	arr[i];
			  
			  }
			  System.out.println("Smallest	"+larg+"	second smallest	"+seclarg);
		}

	}



