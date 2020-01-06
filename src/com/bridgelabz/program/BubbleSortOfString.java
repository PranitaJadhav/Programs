package com.bridgelabz.program;

public class BubbleSortOfString {

	public static void main(String[] args) {

		String[] str	=	{"Pranita","Sonam","Riya","Dipesh"};
		String temp;
		
		for(int i = 0;i<str.length;i++) {
			
			for(int j = i+1;j<str.length;j++) {
				
				
				if(str[j].compareTo(str[i])<0) {
					
					temp	=	str[i];
					str[i]	=	str[j];
					str[j]	=	temp;
					
					
					
					
				}
			}
			
			System.out.println(str[i]);
		}
		
		
		
	}

}
