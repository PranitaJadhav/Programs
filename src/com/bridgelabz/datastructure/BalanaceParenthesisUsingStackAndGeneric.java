/*to check given expression is balanaced or not
 * 
 */
package com.bridgelabz.datastructure;

/**
 * @author Pranita Ananada Jadhav
 *
 */
public class BalanaceParenthesisUsingStackAndGeneric {
	
	
	
	
	public static void checkBalanaceParenthesis(String str) throws Exception {
		
		
		
		//to access all operation of stack

		GenericStackLLUtility<Character> GenericStackLLUtility	=	new GenericStackLLUtility();
		
		 for(int i = 0;i<str.length();i++) {
			 
			 char ch	=	str.charAt(i);
					 
					if(ch == '{' || ch  ==  '[' || ch  ==  '('){
						
						GenericStackLLUtility.push(ch);
						
						
					}
					
					else if(ch == '}'  ||  ch  ==  ']'   ||  ch  ==  ')' 
							&& !GenericStackLLUtility.isEmpty()){
						
						if(((char)GenericStackLLUtility.peek()== '('&& ch == ')')  ||
							((char)GenericStackLLUtility.peek()== '{'&& ch == '}') ||
								((char)GenericStackLLUtility.peek()== '['&& ch == ']')){
							
							          GenericStackLLUtility.pop();
							
						}//if
						
						else {
							
							System.out.println("Not balanced");
						}//else
				}//else if
					
					
					
			/*
			 * else {
			 * 
			 * if ((ch == ']' || ch == '}' || ch == ')')) {
			 * 
			 * System.out.println("//Not balanced");
			 * 
			 * 
			 * }//else
			 */						
		} //for
						
		if(GenericStackLLUtility.isEmpty() == true) {
			
 
			System.out.println(" balanced");

		}				
						
					
			
			  else {
			  
			  System.out.println("Not balanced");
			  
			  }
			 
	}
	
	

	
	public static void main(String[] args) throws Exception {
		AllUtility utility	=	new AllUtility();
		
		System.out.println("Enter the expression");
		String str	=	utility.readString();
		
		
		checkBalanaceParenthesis(str);
	
		
		

	}

}
