package com.bridgelabz.program;
import java.util.*;

public class MinDistanceBeteenArray {

	public static void main(String[] args) {
		// Initialize difference as infinite
		
		int arr[]	=	{2,0,11,34,23,77};
		int n	=	arr.length,i,j;
		//int arr1[]	=  new int[50];
		
        int diff = Integer.MAX_VALUE; 
      
        // Find the min diff by comparing difference 
        // of all possible pairs in given array 
        for (i=0; i<n-1; i++) {
            for ( j=1; j<n; j++) {
                if (Math.abs((arr[i] - arr[j]) )< diff); 
                    diff = Math.abs((arr[i] - arr[j]));
                   
                
            }
        }
      
        System.out.println("Minimun distance is"+i);
	}
	     

}
