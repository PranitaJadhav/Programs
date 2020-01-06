package com.bridgelabz.program;
import java.util.*;

public class PrintPallindromeString {

	public static void main(String[] args) {
		
		  String w = ""; 
		  String rw = ""; 
		  char ch; 
		  int i,l; 
		  String s;
		  
		  System.out.println("enter the sentence");
		  
		  Scanner sc = new Scanner(System.in); 
		  s = sc.nextLine(); 
		  s = s+""; 
		  l = s.length();
		  
		  for(i=0;i<l;i++) {
		  
		  
		  ch = s.charAt(i); 
		  if(ch !=' ') {
		  
		  w = w + ch;
		   rw= ch + rw; 
		   
		   }
		  
		  
		  
		  
		  else {
		  
		  if(w.equalsIgnoreCase(rw)) {
		  
		  System.out.println("palindrome string is	"+w); }
		  
		  w = ""; rw= ""; } }
		 
	}
	}


