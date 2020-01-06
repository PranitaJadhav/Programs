package com.bridgelabz.functional;

public class TripletProgram {

	public static void main(String[] args) {
			int arr[]	=	{2,4,6,7,8,9,0,1,2,3,5,-9};
			int n		=	arr.length;
			int sum		=	10;
			
			    for(int i=0;i<n-2;i++) 
			    {
			    	
			    	for(int j=i+1;j<n-1;j++) 
			    	{
			    		
			    		for(int k=j+1;k<n;k++)
			    		{
			    			
			    			 if(arr[i]+arr[j]+arr[k]==0) 
			    			 {
			    				 
			    				 System.out.println("triplet    "+arr[i]+" "+arr[j]+" "+arr[k]);
			    			 }
			    		}
			    	}
			    }
	}

}
