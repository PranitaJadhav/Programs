package com.bridgelabz.datastructure;


public class Regex {
	public static void main(String[] args) {
		
		Utility1 utility	=	new Utility1();
		//Date d1=new Date();
		String string= "Hello <<name>>, We have your fullname as <<full name>>\n "
				+ "in our system.\n "
				+ "Your contact number is 91-xxxxxxxxxx.\n "
				+ "Please,let us know in case of any clarification \n"
				+ "Thank you BridgeLabz xx/xx/xxxx.  ";
		
		System.out.println(string);
		System.out.println();
		
		System.out.println("Enter a username ");
		String username=utility.readString();
		
		System.out.println("Enter a Fullname of user ");
		String fullname=utility.readString();
		
		System.out.println("Enter a Mobile number of user ");
		String mobile_number=utility.readString();
		
		System.out.println("Enter a date ");
		
		String date=utility.readString();
		
		utility.regex( username, fullname, mobile_number,date,string);
		;
		
		
	}

}