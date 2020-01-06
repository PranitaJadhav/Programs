package com.bridgelabz.program;
import java.util.*;

public class OddNosPrimePosition {

	public static void main(String[] args) {
 
		ArrayList<Integer> arr	=	new ArrayList<Integer>();
		ArrayList<Integer> arr2	=	new ArrayList<Integer>();
		//int i					=	0;
		  int count				=	0;
		
		//add the elements in array  
		
		for( int i=0;i<=100;i++) {
			
			if(i%2!=0)
				arr.add(i);
		}
		
		System.out.println(arr);
		
		
		  for(int i = 0;i<arr.size();i++) {
			  
			  for(int j=2;j<arr.size();j++) {
		  
				  if(arr.get(i)%j!=0) {
					  
					  
					  //count+=count;
					  arr2.add(i);
				  }
		  
		  }
			 
		  
	 }
		  
		  System.out.println(arr2);
		
		 
	}
}

