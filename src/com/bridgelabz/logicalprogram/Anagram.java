package com.bridgelabz.logicalprogram;




public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		String str2;
		

		Utility1 utility	=	new Utility1();
		
		str1	=	utility.readString();
		str2	=	utility.readString();
		
		int   result	=	utility.isAnagram(str1, str2);
		
		
		
		 if(result==1)
			 System.out.println("String are not anagram");
		 
		 else {
			 
			 System.out.println("Strings are anagram");
		 }
	
	
	}

}
