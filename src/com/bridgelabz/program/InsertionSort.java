package com.bridgelabz.program;

public class InsertionSort {
	
	
	
	public static void insertionSort(int[] arr) {
		int i;
		
		for( i  = 1;i<arr.length;i++) {
			
		int	key	=	arr[i];
			
		int	j	=	i-1;
		
		while(j>0  &&  arr[j]>key) {
			
			arr[j+1]	=	arr[j];
			j	=	j-1;
			
		}
		 arr[j+1]	=	key;	
		
	}
	 for( i = 0;i<arr.length;i++) {
		System.out.println(arr[i]);
	 }
	}
	



public static void main(String[] args) {
	
	int[] arr	=	{1,6,7,3,9,10};
	
	insertionSort(arr);
	
	
}


}