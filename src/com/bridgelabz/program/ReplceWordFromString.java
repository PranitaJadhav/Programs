package com.bridgelabz.program;

import java.util.Scanner;

public class ReplceWordFromString {

	public static void main(String[] args) {

		Scanner sc	=	new Scanner(System.in);
		
		String str1	=	"hi<<user name>>. How r u";
		
		System.out.println("Enter the name");
		String str2	=	sc.nextLine();
		
        String str3	=	str1.replaceAll("<<user name>>",str2);
        
        System.out.println(str3);
		
		
		
	}

}
