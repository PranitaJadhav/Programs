package com.bridgelabz.program;

public class ReverseOfString {

	public static void main(String[] args) {

		String str	=	"I am Pranita";
		
		String arr[]	=	str.split(" ");
		
		 for(int i = arr.length-1;i>=0;i--) {
			 
			 
			 System.out.println(arr[i]);
		 }
	}

}
