/**Purpose: Print the to check given string are pallindrome or not using string
 * @author Pranita Ananada Jadhav
 *
 */

package com.bridgelabz.datastructure;
public class IsPallindromeChecker {

	public static void  main(String[] args) {
		
		LinkedListDeque<Character>		dq	=	new LinkedListDeque();
		AllUtility		  utility				=	new AllUtility();
		QueueDequeueUtility <Character> q	= 	new QueueDequeueUtility(0);
		
		String str;
		System.out.println("Enter the string to check pallindrome");
		
		str	=	utility.readString();
		
		for(int i = 0;i<str.length();i++) {
			
			char c	=	str.charAt(i);
			dq.insertFirst(c);
			
			
		}
		
		
		
	 while(dq.size()>1) {
		  
			  if(dq.removeFirst().i.equals(dq.removeLast().i)) {
			  
			  System.out.println("yes");
		  
		  }
			  else {
		  
				  System.out.println("no"); } 
		  }
		 
		 
		//System.out.println("List is");
		//dq.displayForward();
		
		
		
		
		
		  //int flag = 0;
		  
		/*
		 * while(dq.size()>1){ if(dq.getFirst()==dq.getLast()) {
		 * 
		 * flag = 1; dq.removeFirst(); dq.removeLast();
		 * 
		 * break;
		 * 
		 * 
		 * 
		 * }
		 * 
		 * if(flag == 1) { System.out.println("String is pallindrome"); }
		 * 
		 * else { System.out.println("String is not pallindrome");
		 * 
		 * 
		 * }
		 * 
		 * }
		 */
		  
		 
		 
		
		
		/*
		 * String[] str1 =dq.displayBackward(); dq.displayForward();
		 */
		 
		 
		
	}

}
