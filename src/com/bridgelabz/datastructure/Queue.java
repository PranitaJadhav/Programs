package com.bridgelabz.datastructure;

import java.util.Scanner;

public class Queue<T> {
	static int front = -1;
	static int rear = -1;
	static int max = 500;

	static int queue[] = new int[max];
	private static int check = 0;
	static int bank_amount = 5000;
	static int deposit = 0;
	static int withdraw = 0;

	public static int[] enqueue(int data) {
		if (rear == max - 1) {
			System.out.println("Queue is full ");
		}
		else
			front=0;
		
			rear = rear + 1;
		 queue[rear] = data;
		
		 return queue;
	}

	public static void dequeue() {
		if (front == -1 || front > rear) {
			System.out.println("Queue underflow ");
		} else {
			front = front + 1;

		}
	}

	public static void display() {
		if (front == -1) {
			System.out.println("Queue is empty ");
		} else {
			for (int i = 0; i <= rear; i++) {
				System.out.print(queue[i] + " ");

			}
		}
	}

	public static void enQueue(int users) {
		for (int i = 1; i <= users; i++) {
			transaction();

		}

	}

	private static void transaction() {
		
		Scanner sc	=	new Scanner(System.in);

		System.out.println("Enter your choice \n1.Deposit \n2. Withdraw ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter amount to deposit ");
			int money = sc.nextInt();
			check = 1;
			deQueue(money, check);
			break;
		case 2:
			System.out.println("Enter amount to withdraw ");
			money = sc.nextInt();
			check = 0;
			deQueue(money, check);
			break;
		default:
			System.out.println("Enter a proper choice ");
			transaction();

		}

	}

	public static void deQueue(int money, int check2) {
		
		if (check == 1) {
			bank_amount = bank_amount + money;

			System.out.println(  "Depsited Successfully");
			System.out.println(bank_amount);
			System.out.println();

		} else {
			if (money < bank_amount) {
			bank_amount = bank_amount - money;
				System.out.println(  "Withdraw Successfully ");
				System.out.println(bank_amount);
				System.out.println();

			} else
				System.out.println("No enough balance ");
			dequeue();
			

		}
	}
}
		
