package com.bridgelabz.datastructure;

import java.io.File;
import java.util.Scanner;

public class LinkList<E>{
	
	public static int[] readFile() {
		
		  try {
			  
			   File f	=	new File("/home/bridgeit/Desktop/IntegerFile.text");
			   Scanner sc	=	new Scanner(f);
			   int count	=	0;
			     while(sc.hasNext()) {
			    	 
			    	 count++;
			    	 sc.nextInt();
			     }
			     
			     int[] arr	=	new int[count];
			     Scanner s	=	new Scanner(f); 
			     
			     for(int i = 0; i < arr.length; i++) {
			    	 
			    	 arr[i]	=	s.nextInt();
			     }
			  return arr;
		  }
		  
		  catch(Exception e){
			  
			  e.printStackTrace();
			  return null;
		  }
		
		
		
		
	}
	

	Node head;
	public class Node {
		  E data;	//refer to data
		  Node next;  // refer to adressof next node
		    
		  
		  Node(E data){
				   this.data = data;
				   this.next	=	null;
				  }
			  
			  public  void displayData(){
				   System.out.print(data + " ");
				
				  }
		}

	
	
	
	   public void insert(E data) //int data will take the value from runner class
	   {
		   
		   Node node 	=	new Node(data);
		   //E data	=	data;
		   node.next	=	null;
		   
		   if(head==null) {
			   
			   head	=	node;
		   }
		   
		   else {
			   
			   Node n	=	head;
			     
			   while((n.next!=null)) {
			   
			   
			   n	=	n.next;
			   }
			   n.next	=	node;//node is new node which we have created to insert
		   }
		   
		   
		   
	   }
	   
	
	/*
	 * public void sort() {
	 * 
	 * Node current = head; Node index = null; int temp;
	 * 
	 * if(head==null) {
	 * 
	 * return; }
	 * 
	 * else { while(current!=null)
	 * 
	 * {
	 * 
	 * index = current.next;
	 * 
	 * while(index!=null) {
	 * 
	 * if(current.data>index.data)
	 * 
	 * {
	 * 
	 * temp = current.data; current.data = index.data; index.data = temp;
	 * 
	 * }
	 * 
	 * index = index.next; }
	 * 
	 * current = current.next; }
	 * 
	 * } }
	 */
	   
	   
	   public void insertAtBegin(E data) {
		   
	 // you just need to change the address of head location to current location
//i.e node to be adddes and the address for current location will ne 1st location
		   
		   Node node	=	new Node(data);
		   node.data	=	data;
		   node.next	=	null;
		   node.next	=	head;
		   
		   head			=	node;
		   
}
	    
	   
	   public void  inserAtIndex(int index,E data) {
		   
		   Node node	=	new Node(data);
		   node.data	=	data;
		   node.next	=	null;
		   
		     
		      if(index==0) {
		    	  
		    	  
		    	  insertAtBegin(data);
		      }
		      
		      
		      else {
		    	  Node n		=	head;
		   
				      for(int i =  1;i<index;i++) {
				    	  
				    	  n	=	n.next;
				      }
				   
				   node.next	=	n.next;
				   n.next		=	node;
		      	}
	   }
	   
	   
	   void deletAt(int index) {
		   
		   if(index == 0) {
			   
			   head	=	head.next;
		   }
		   
		   else {
			   Node n	=	head;
			   Node n1	=	null;
			   
			   for(int i  = 0;i<index-1;i++) {
				   
				   	n	=	n.next;
			   }
					n1	=	n.next;
				   	n.next	=	n1.next;
				   	
				   	System.out.println("Deleted element is"+n1.data);
			   }
		   }
	   
	   
	  public void searchedEleDelete( E data) {
		  
		  Node current	=	head;
		  Node temp	=	null;
		  
		  while(current != null   &&  current.data	!= data) {
			  
			   temp	=	current;
			   current	=	current.next;
		  }
		 
		  
		  if(current == null)
			  return;
		  
		  
		  temp.next	=	current.next;
		  }
		  
		  
		 
			    
	   
	   
 public void show() {
		   
		   Node node	=	head;
		   
		     while(node.next!=null) {
		    	 
		    	System.out.println(node.data);
		    	node	=	node.next;//to increment the loop
		    	
		     }
		  // loop will traverse till length-1 so lastnode value will not print

		     System.out.println(node.data);//it will print the last node value
		     }
	     
	   
	 
 public boolean isEmpty() {
	 
	 if(head ==  null) {
	 return true;
	 }
	 
	 else {
		 
		 return false;
	 }
	
	 
 }
 
 public void search(E data) {
	 Node current = head;
	 
	 int i	=	1;
	 boolean flag	=	false;
	 
	 if(head  ==  null) {
		 
		 System.out.println("list is empty");
	 }
	 else {
		 
		 while(current!= null) {
			 
			 if(current.data  == data) {
				 
				 flag = true;
				 break;
			 }
			 i++;
			 current	=	current.next;
		 }
		 
		 if(flag = true) {
			 
			 System.out.println("Element is found at position    "+i);
		 }
		 
		 else {
			 
			 System.out.println("Element not found");
		 }
	 }
	
	 
	 
	 
 }




 

}
