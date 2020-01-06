package com.bridgelabz.datastructure;




public class PrimeAnagramUsingQueue {
	public static void main(String[] args) {

		int prime[] = Utility1.prime(1000);
		
		int anagram[]=Utility1.anagramPrime(prime);
		for (int i : anagram) {
			Queue.enqueue(i);

		}
			Queue.display();	
		
		

	}
}
