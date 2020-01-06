package com.bridgelabz.datastructure;

//import fellowship.bridgelabz.utility.Utility1;

/*
 * * Purpose: Create a Program which creates Banking Cash Counter where people come in to deposit Cash and withdraw Cash. Have an input panel to * * add people to Queue to either deposit or withdraw money and dequeue the people. 
 *   Maintain the Cash Balance. 	
 *   
 *   */

public class CashCounterUsingQueue {
	
	


	public static void main(String[] args) {

		QueueDequeueUtility q   =		new QueueDequeueUtility(5);
		Utility1 utility			=		new Utility1();
		String exit;
		
		
		int choice, usercount = 0;
		String name;
		char c1; 
		do {
			System.out.println("Press 1. Enter into Line");
			System.out.println("press 2. Process Deposit / withdrow");
			System.out.println("press 3. to show How many people in the row remaining");
			choice = utility.readInteger();
			switch (choice) {
			case 1:
				usercount++;
				
				System.out.println("Add the user" + usercount + " into line");
				
				System.out.println("Enter the Username :");
				
				name = utility.readString();
				
				q.enqueue(name);
				break;
			case 2:
				q.deQueue();
				break;
			case 3:
				q.display();
				break;
			default:
				System.out.println("Enter the Valid Cases :");
		
	}
		
}while(choice<=3);
		
	}//main
}//class
