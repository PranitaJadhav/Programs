package com.bridgelabz.datastructure;

import java.util.Scanner;

public class QueueDequeueUtility<E> {
	
	AllUtility utility	=	new AllUtility();
	
	int bankAmount	=	1000;
	Scanner sc	=	new Scanner(System.in);
	
	private E list[];
	int size,front,rear,length;
	
	public QueueDequeueUtility(int size) {
		
		list		=	(E[]) new Object[size];
		front		=	0;
		rear		=	0;
		this.size	=	size;
		length		=	list.length;
		
	}
	
	public void deposite() {
		
		int amt;
		
		System.out.println("Enter the amount to deposite");
		amt	=	sc.nextInt();
		
		  if(amt>100) {
			  
			  bankAmount	=	bankAmount+amt;
		  }
		  else {
			  
			  System.out.println("please enter amount greater than 100");
		  }
		
	}
	
	public int withdraw() {
		
		int amt;
		System.out.println("Enter the amount to withdraw");
		amt	=	sc.nextInt();
		
		return bankAmount	=	bankAmount-amt;
	}
	
	
	public void display() {
		
		for(int i = 0;i<size;i++) {
			
			System.out.println(list[i]+"      ");
		}
	}

	public void enqueue(E name) {
		if(rear  == size-1) {
			
			System.out.println("queue is full");
		}

		list[rear]	=	name;
		rear++;
		length++;
		
		System.out.println("user name"+list[rear]+"is added");
		
	}
	
	public  void deQueue() {
		
		if(isEmpty() == true) {
			
			System.out.println("queue is empty");
		}
		
		
		System.out.println("Enter the choice");
		System.out.println("1 : deposite");
		System.out.println("1: withdraw");
		
		int ch	=	sc.nextInt();
		
		switch(ch) {
		
		case 1 :
			deposite();
			front++;
			System.out.println("Please next...");
			size--;	
			
			System.out.println("Bank amount  "+bankAmount);
			break;
			
			
			
			
		case 2:
			if(withdraw() > 0) {
				
				System.out.println("Amount is  "+bankAmount);
				
				
				
			}
			
			else {
				
				System.out.println("balanace is not available");
			}
			break;
			
		default : System.out.println("Enter valid choice");
			
			
		}//switch
		
		
		
		
		
		
		/*
		 * E data = list[front]; front = front+1; length = length-1;
		 */
		
	}
	
	public boolean isEmpty() {
		
		if(front>rear) {
			
			return true;
		}
		return false;
	}

	

}
