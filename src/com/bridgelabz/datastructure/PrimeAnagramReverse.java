package com.bridgelabz.datastructure;


public class PrimeAnagramReverse {
	public static void main(String[] args) {
		StackUsingLinkedList1 stl = new StackUsingLinkedList1();

		int arr[] = Utility1.prime(1000);
		int arr2[] = Utility1.anagramPrime(arr);
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] != 0)
				stl.push(arr2[i]);

		}

		stl.display();

	}

}