package com.bridgelabz.program;

import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1	=	"heart";
		String str2 =	"true";
		
		 if(str1.length()!=str2.length()) {
			 
			 System.out.println("String is not anagram");
		 }
		 else{
			 
			 char String1[]	=	str1.toCharArray();
			 char String2[]	=	str2.toCharArray();
			 
			  Arrays.sort(String1);
			  Arrays.sort(String2);
			  
			  	if(String1.equals(String2)==true)
			  	{
			  		
			  		System.out.println("Strings are anagaram");
			  	}
			  	else
			  	{
			  		
			  		System.out.println("Strings are not anagaram");
			  	}
			  
			  
			 
			 
		 }
	}

}
