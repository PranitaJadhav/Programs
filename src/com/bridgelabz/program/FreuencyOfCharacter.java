package com.bridgelabz.program;
import java.util.*;

public class FreuencyOfCharacter {

	public static void main(String[] args) {

		int i,j,k,l=0;
		char c,ch;
		
		Scanner sc	=	new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str1	=	sc.nextLine();
		
		for(c='A';c<='z';c++) {
			
			k=0;
			
			for(j=0;j<str1.length();j++) {
				
				
				ch	=   str1.charAt(j);
				if(ch==c) {
					
					k++;
				}
				

			}
			
			if(k>0) {
				
				System.out.println("the character "+c+"has occurence   "+k);
				
			}
			
		}
		
	}

}
