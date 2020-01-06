package com.bridgelabz.program;

public class Descending_Order {

	public static void main(String[] args) {
		
		Utility1 utility	=	new Utility1();
		int n;
		System.out.println("Enter the no of elements");
		n	=	utility.readInteger();
		
		
		int arr[]	=	new int[n];
		
		
		
		System.out.println("Enter all the elements:");

        for (int i = 0; i < n; i++) 

        {

            arr[i] = utility.readInteger();

        }
        
        
        System.out.println("Array in descending order");
        
      	utility.DescendingOrderOfArray(arr);
       
	}

}
