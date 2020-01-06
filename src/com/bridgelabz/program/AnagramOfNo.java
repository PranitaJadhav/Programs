package com.bridgelabz.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AnagramOfNo {

	public static void main(String[] args) {

		//ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		ArrayList arr = new ArrayList();
		ArrayList arr1 = new ArrayList();

		
		int no1	=	1112, no2	=	1211,r	=	0, i	=	0;
		
		while(no1>0) {
			
		
			r	=	no1%10;
			arr.add(r);
			no1	=	no1/10;
                                                                                         			i++;

	 }
		
		while(no2>0) {
			
			r	=	no2%10;
			arr1.add(r);
			no2	=	no2/10;
	                                                                                         			i++;

		}
		
		System.out.println("Array before sorting");
			System.out.println(arr);
			System.out.println(arr1);

			if(arr.size()!=arr1.size()) {
				System.out.println("Both no are not anagram");
			}
			
		
		  System.out.println("Array After sorting");
		  
		  Collections.sort(arr); 
		  Collections.sort(arr1);
		  
		  System.out.println(arr); System.out.println(arr1);
		 
		 
				if(arr.equals(arr1)){
					System.out.println("Anagram");	
					
				}	
					
				else {
				
					
					System.out.println("not anagram");
				}
				
			
	}
	/*
	 * Object[] array = new Integer[arr.size()]; for(i=0;i<arr.size();i++) {
	 * 
	 * array[i] = arr.get(i); // array = arr.toArray();
	 * 
	 * }
	 * 
	 * 
	 * Object[] array1 = new Integer[arr1.size()]; for(i=0;i<arr.size();i++) {
	 * 
	 * array1[i] = arr1.get(i); // array = arr.toArray();
	 * 
	 * }
	 */

}


