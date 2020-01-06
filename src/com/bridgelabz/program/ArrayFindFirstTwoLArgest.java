package com.bridgelabz.program;
import java.util.*;
//Program to find largest and second largest element of array

public class ArrayFindFirstTwoLArgest {

	public static void main(String[] args) {
		Scanner sc	=	new Scanner(System.in);
		
		int n;
		System.out.println("Enter the no of elements");
		n	=	sc.nextInt();
		int arr[]	=	new int[50];
		System.out.println("Enter all the elements:");

        for (int i = 0; i < n; i++) 

        {

            arr[i] = sc.nextInt();

        }
        
        int larg1	=	arr[0];
        int larg2	=	arr[1],temp;
        
        	if(larg1<larg2) {
        		

     		   temp		=	larg1;
     		   larg1	=	larg2;
     		   larg1	=	temp;
     		   
        	}
        	for(int i=2;i<arr.length;i++)
        	{
        		
        	   if(arr[i]>larg1)
        		   
        	   {
        		   
        		   larg2	=	larg1;
        		   larg1	=	arr[i];
        	   }
        	   else if(arr[i]>larg2 && arr[i]!=larg1) {
        		   
        		   larg2	=	arr[i];
        	   }
        	}
        	
        	System.out.println("Larger and secondlarger"+larg1+larg2);
        //*******************************************************************************	
        	
        //Second and first smallest
        	
        	
		
		  for(int i=0;i<arr.length;i++) {
		  
			  for(int j=1;j<arr.length-15;j++) {
				  
				  temp	=	arr[i];
				  arr[i]	=	arr[j];
				  arr[j]	=	temp;			  }
			  }
		 
        	System.out.println("Second smallst and smallest"+arr[1]+arr[0]);
        	
//***********************************Descending order******************************
        	

  		  for(int i=0;i<arr.length;i++) {
  		  
  			  for(int j=i+1;j<arr.length;j++) {
  				  
  				  	if(arr[i]<arr[j]) {
  				  
  				  temp	=	arr[i];
  				  arr[i]	=	arr[j];
  				  arr[j]	=	temp;
  				  	}
  				  }
  			  }
  		 
		System.out.println("Array in descending order");
        for (int i = 0; i < n - 1; i++) 

        {

            System.out.print(arr[i] + ",");

        }
		  
        System.out.print(arr[n - 1]);
        
        
 //*********************ascending*************************************

		  for(int i=0;i<arr.length;i++) {
		  
			  for(int j=i+1;j<arr.length;j++) {
				  
				  	if(arr[i]>arr[j]) {
				  
				  temp	=	arr[i];
				  arr[i]	=	arr[j];
				  arr[j]	=	temp;
				  	}
				  }
			  }
		 
		System.out.println("Array in ascending order");
      for (int i = 0; i < n - 1; i++) 

      {

          System.out.print(arr[i] + ",");

      }
		  
      System.out.print("\n");
      
      
     //************************insertion of element*********************
      System.out.println("inserted element in array");
        	
      System.out.print("Enter Element to be Insert : ");
      int ele= sc.nextInt();
      System.out.print("At Which Position ? (Enter Index Number ) : ");
      int pos = sc.nextInt();
      
        	for(int i =n;i>pos;i--) {
        		arr[i]	=	arr[i-1];
        	}
        	
        	 arr[pos]	=	ele;
        	 for (int i = 0; i < n+1; i++) 

             {

                 System.out.print(arr[i] + ",");

             }
       		  
        	
       		  
             //System.out.print(arr[n - 1]);
              
             
             
        	
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             
	}

}
