package com.bridgelabz.program;
//import java.util.*;

//import fellowship.bridgelabz.utility.Utility1;

public class BinarySearchForString {

	public static void main(String[] args) {

	Utility1 utility	=	new Utility1();
	String[] str	=	new String[4];
	
	System.out.println("Enter the string");
	
	for(int i  =  0;i<4;i++) {
	
		System.out.println(i);
	   str[i]	=	utility.readString();
	
	}
	
		System.out.println("Enter the key to search");
	
		String key		=	utility.readString();
		
		
		
		
		int index	=	utility.binarySearch(key, str);
		
		
		
		   System.out.println("elementfound at"+index);
			   
			   
			    
				   
				   
				 
		 
	}

}
