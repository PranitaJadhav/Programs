package com.bridgelabz.datastructure;

public class LinkedListDeque<E>{
	
	int size=0;
	 private Node head;
	 private Node tail;
	 
	 static class Node<E>{
	  //data
	  E i;
	  // next node in the list
	  Node next;
	  // previous node in the list
	  Node prev;
	  
	  Node(E data){
	   this.i = data;
	  }
	  
	  public  void displayData(){
		   System.out.print(i + " ");
		
		  }
	  
	  }
	 
	 // constructor
	 public LinkedListDeque(){
	  this.head = null;
	  this.tail = null;
	 }
		/*public static void insert(E data){

			//create a new node to insert
			Node newNode	=	new Node(data);
			
			if(isEmpty()) {
				
				head	=	tail	=	newNode;
				
			}//if
			
			else {
				
				
				tail.next	=	newNode;

				
				
			}
			
			tail	=	newNode;

		}
		*/
		public boolean isEmpty() {
			
			if(head ==  null) 
				return true;
			
			return false;
				
				
		}//isEmpty
		
		public void insertFirst(E data) {
			
			//create a new node to insert
			Node newNode	=	new Node(data);
			
			//if it is first node it should also point to tail
			
			if(isEmpty()) {
				tail	=	newNode;
				
			}//if
			
			else {
				
				head.prev	=	newNode;
			}
			
			newNode.next	=	head;
			head			=	newNode;
			size++;
			
			
		}//insertFirst
		
		public void inserLast(E data) {
			
			//create a newnode to insert
			Node newNode	=	new Node(data);
			
			//if list is empty then tail also point to newnode
			if(isEmpty()) {
				
				tail	=	newNode;
			}//if
			
			else {
				
				tail.next	=	newNode;
			}//else
			
			tail	=	newNode;
			size--;
			
			
		}//inserLast
		
		public Node removeFirst()  {
		
			
			
			if(isEmpty()) {
				
				System.out.println("string is empty");
			}//if
			

			
			Node first	=	head;

				
				if(head.next  ==  null) {//if there is only one node then set tail to null
					
					tail	=	null;
					
					
				}//if
				
				else {
					
					head.next.prev	=	null;
					
					
					
				}//else
				
				head	=	head.next;
				size--;
				
	
			return first;
			
		}//removeFirst
		
		
		public Node removeLast()  {
			
			if(isEmpty()) {
				
				System.out.println("string is empty");
			}//if
			
			
			
				
				Node last	=	tail;
				
				if(head.next == null) {
					
					head	=	null;
				}
				
				else {
					
					//next of previous node become null
					
					tail.prev.next	=	null;
				}
				
				tail	=	tail.prev;
				size--;

				
				return last;
		}//removeLast
		
	
		public  int size() {
			
			return size;
		
		}//size
		
		//public void display
		
		// Method for forward traversal
		 public void  displayForward(){
			 
			 Node current = head;
		  
				  while(current != null)
				  {
				   current.displayData();
				   current = current.next;
				  }
				  System.out.println("");
				
				 }
				
		// Method to traverse and display all nodes
		 public String[] displayBackward()
				 {
					 
				  Node current = tail;
						  while(current != null){
								   current.displayData();
								   current = current.prev;
						  }
				  System.out.println("");
				return null;
				
				  
		 }	
		 
		 
		 
		 
		 
		 
		 
		 public char getFirst(){
			  if(isEmpty()){
			   throw new RuntimeException("Deque is empty");
			  }
			  return (char) head.i;
			 }
			 
			 public char getLast(){
			  if(isEmpty()){
			   throw new RuntimeException("Deque is empty");
			  }
			  return (char) tail.i;
			 }
	/*
	 * public void display() {
	 * 
	 * Node current = head }
	 */
	
	
}//class
