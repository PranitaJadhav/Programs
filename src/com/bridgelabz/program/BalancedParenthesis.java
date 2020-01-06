package com.bridgelabz.program;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

	/**
	 * Function to check for parenthesis is balanced or not
	 * 
	 * @param s the String containing arithmetic expression which needs to check
	 * @return 
	 * @return true is balanced or false if not balanced
	 */
	
	
	public static boolean check(String s) {
		
		Stack<Character> st  =	  new Stack<>(); 
		
		 for(int i = 0;i<s.length();i++) {
			 
			 char c 	=	s.charAt(i);
			 
			 if(c   ==  '{'  ||  c  ==  '['  ||  c  ==  '(') {
				 
				 st.push(s.charAt(i));
			 }
			 
			 else if(c   ==  '}'  ||  c  ==  ']'  ||  c  ==  ')') {
				 
				 st.pop();
			 }
			 
			
		 }
		 
		 return st.isEmpty();
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc	=	new Scanner(System.in);
		System.out.println("Enter the expression");
		String s	=	sc.nextLine();
		
		String result	=	(check(s))? "Balanced" : "NotBalanced";
		
		System.out.println(result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}