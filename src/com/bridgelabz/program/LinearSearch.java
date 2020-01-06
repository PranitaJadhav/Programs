package com.bridgelabz.program;


public class LinearSearch {
	
public static void main(String[] args) {
	
		Utility1 utility	=	new Utility1();
		
		int n,ele;
		int arr[]	=	{3,5,7,89,10,100};
			n		=	arr.length;
			ele		=	100;
			
			int index	=	utility.linearSearch(arr,n,ele);
			
			  if(index==-1) {
				  
				  System.out.println("Element is not found");
			  }
			
			  else {
			  
			  System.out.println("element is present at		"+index);                                                                                                            
}
		
	}
}


