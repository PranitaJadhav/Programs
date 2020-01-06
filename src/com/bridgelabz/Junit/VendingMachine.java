package com.bridgelabz.Junit;

import com.bridgelabz.utility.Utility1;

public class VendingMachine {
	public static void main(String[] args) {
		Utility1	Utility	=	new Utility1();

		System.out.println("Enter a amount to return in change ");
		int rupees=Utility.readInteger();
		Utility.vendingMachine(rupees);
		
	}

}