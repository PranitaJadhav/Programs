package com.bridgelabz.program;
import java.util.*;
// Program to print the occurences of each character of string

public class StringDemo {
	public static void main(String args[])
	   {
	        int ci, i, j, k, l=0;
	        String str, str1;
	        char c, ch;
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.print("Enter a String : ");
	        str=scan.nextLine();
	        
	        i=str.length();
	        for(c='A'; c<='z'; c++)
	        {
	            k=0;//counter should be 0 for next character
	            for(j=0; j<i; j++)
	            {
	                ch = str.charAt(j);//store the character of string in ch
	                if(ch == c)
	                {
	                    k++;//if character matches then counter increase
	                }
	            }
	            if(k>0)
	            {
	                System.out.println("The character " + c + " has occurred for " + k + " times");
	            }
	        }
	   }

}
