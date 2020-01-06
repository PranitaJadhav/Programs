package com.bridgelabz.datastructure;

//import com.bridgelabz.DataStructureProgram.StackUtility.StackLL;

//import fellowship.bridgelabz.utility.Utility1;

public class Stack {

	public static void main(String[] args) throws Exception {
		//Utility utility	=	new Utility();
		
		StackUtility sl	=	new StackUtility();
		StackLL sl  =	new StackLL();
		
		sl.push(10);
		sl.push(20);
		sl.push(30);
		
		System.out.println("Elements in stack");
		
		sl.display();
		
		
		System.out.println("top most element of stack is");
		
		int firsElement	=	sl.peek();
		System.out.println(firsElement);
		
		
		System.out.println("stack after deleting 1st element");
		  sl.pop(); 
		  sl.display();
		  
		  System.out.println("size of stack is");
		  int size	=	sl.size();
		  System.out.println(size);
		 
		
	
	}
}
