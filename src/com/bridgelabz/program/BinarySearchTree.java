package com.bridgelabz.program;

//import fellowship.bridgelabz.utility.Utility1;

public class BinarySearchTree {

	public static void main(String[] args) {
  
		Utility1 utility	=	new Utility1(); 
		
		 int arr[]	=	{2,4,5,6,7,8,9,10};
		 
		 System.out.println("Enter the no to search");
		 
		 int ele	=	utility.readInteger();
		 
		 int index	=	utility.binarySearchForNo(arr, ele);
		 
		 System.out.println("Element is at position"+index);

		 
		
		
}
}
