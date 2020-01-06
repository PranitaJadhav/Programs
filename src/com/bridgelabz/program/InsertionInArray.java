 package com.bridgelabz.program;


public class InsertionInArray
{
   public static void main(String args[])
   {
	   
	   Utility1 utility	=	new Utility1();
	   
       int size, insert, i, pos;
       int arr[] = new int[50];
       

       
       System.out.print("Enter Array Size : ");
         size	=	utility.readInteger();
       
       
       System.out.print("Enter Array Elements : ");
       for(i=0; i<size; i++)
       {
           arr[i] = utility.readInteger();
       }
	   
       System.out.print("Enter Element to be Insert : ");
       insert	=	utility.readInteger();

       
       System.out.print("At Which Position ? (Enter Index Number ) : ");
       pos	=	utility.readInteger();
       
       int[] arr1	=	utility.insertEleInArray(insert, arr, size, pos);

       
       
   }
}