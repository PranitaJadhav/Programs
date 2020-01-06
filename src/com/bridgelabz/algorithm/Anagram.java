package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility1;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		String str2;
		

		Utility1 utility	=	new Utility1();
		System.out.println("Enter two string to check anagram");
		str1	=	utility.readString();
		str2	=	utility.readString();
		
		boolean   result	=	utility.isAnagramInteger(str1, str2);
		
		
		
		 if(result==false)
			 System.out.println("String are not anagram");
		 
		 else {
			 
			 System.out.println("Strings are anagram");
		 }
	
	
	}

}
