package com.bridgelabz.program;


public class VendingMachine {
	public static void main(String[] args) {
		AllUtility	Utility	=	new AllUtility();

		System.out.println("Enter a amount to return in change ");
		int rupees=Utility.readInteger();
		Utility.vendingMachine(rupees);
		
	}

}