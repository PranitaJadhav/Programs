package com.bridgelabz.datastructure;


public class SortLinkList{

	Node head;
	public class Node {
		  int data;	//refer to data
		  Node next;  // refer to adressof next node
		    
		  
		  Node(int data){
				   this.data = data;
				   this.next	=	null;
				  }
			  
			  public  void displayData(){
				   System.out.print(data + " ");
				
				  }
		}

	

	  public void sort() {
	  
	  Node current = head; Node index = null; int temp;
	  
	  if(head==null) {
	  
	  return; }
	  
	  else { while(current!=null)
	  
	  {
	  
	  index = current.next;
	  
	  while(index!=null) {
	  
	  if(current.data<index.data)
	  
	  {
		  int temp1;
	  
		  temp1 = current.data; 
		  current.data = index.data; 
		  index.data = temp1;
	  
	  }
	  
	  index = index.next; }
	  
	  current = current.next; }
	  
	  } }
	 
	   
	   

}
