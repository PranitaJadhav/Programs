package com.bridgelabz.datastructure;

public class StackUtility {
	
	 public static class Node{
		
		int data;
		Node next;
		
		public Node(int data) {//constructor of class node
			
			this.data	=	data;
			this.next	=	null;
		}//constructor
	
	}//node
	public  static class StackLL{
		
		private Node head;
		
		public StackLL() {
			
			this.head	=	null;
		
		}//constructor
		
		public void push(int data) {
			
			//Create a node to insert in ll
			
			Node newNode	=	new Node(data);
			
			newNode.next	    =	this.head;
			this.head			=	newNode;
		
		}//push
		
	
		
		public boolean isEmpty() {
			
			if(this.head == null) {
				
				return true;
			}
			
			return false;
		}
	
	
	public void display() {
		
		if(isEmpty() == true) {
			
			System.out.println("Stack is empty");
			
			
		}//if
		
		
			
			Node temp	=	head;
			while(temp!=null) {
				
				System.out.println(temp.data);
				temp	=	temp.next;
				
			
			}//while
		
		
		
		
	}//display
	
	
	public void pop() {
		
		
		
		if(isEmpty() == true) {
			
			System.out.println("stack is empty");
		}//if
		
		Node temp	=	this.head;
		this.head	=	this.head.next;//it will remove the link between first 
									  // element and head then head will link to
									 //second node
		
		
		
		
	}//pop
	
	//method return top most element of data
	
	public int peek() throws Exception{
		
		if(isEmpty() == true) {
			
			System.out.println("Stack is empty");
			throw new Exception("Stack is empty");
		}
		
		
		return this.head.data;
		
		
	}//peek
	
	
	
	public int size() {
		
		if(isEmpty() == true) {
			
			return 0;
		}
		
		Node temp	=	this.head;
		int count=0;
		
        while(temp!=  null) {
        
        	count++;
        	temp	=	temp.next;
        	
        }
        
		return count;
		
		
		
	}//size

  }//StackLL
	
	
  
}//StackUtility