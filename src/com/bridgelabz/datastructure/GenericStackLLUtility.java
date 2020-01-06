/**  Utility class for linklist using stack
 * 
 */
package com.bridgelabz.datastructure;



/**
 * @author Pranita Ananada Jadhav
 *
 */
public  class GenericStackLLUtility <E> implements GenericStackLLInterface<E> {

	private Node <E> head=null;
	private static class Node<E>{
		
		E data;
		private Node <E> next=null;
		
		Node(E data){
			
			this.data	=	data;
			 
			}
	}

	
	
	public void push(E v) {
		
		Node <E> newNode	=	new Node<E>(v);
		
		
		
		newNode.next	=	head;
		head			=	newNode;
		
		
		
		
		
	}

	@Override
	public void pop() {

		if(isEmpty() == true) {
			
			System.out.println("stack is empty");
		}//if
		
		Node temp	=	head;
		head		=	head.next;//it will remove the link between first 
									  // element and head then head will link to
									 //second node
		
		
		
		
	}

	@Override
	public E peek() throws Exception {
     if(isEmpty() == true) {
			
			System.out.println("Stack is empty");
			throw new Exception("Stack is empty");
		}
		
		
		return this.head.data;
		
	}

	@Override
	public boolean isEmpty() {
		if(head == null) {
			
			return true;
		}
		
		return false;
	}
	

	@Override
	public int size() {

		  if(isEmpty() == true) {
			
			return 0;
		}
		
		   Node temp	=	this.head;
		   int count 	=	0;
		
		        while(temp!=  null) {
		        
		        	count++;
		        	temp	=	temp.next;
		        	
		        }
        
		return count;
		
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

}
