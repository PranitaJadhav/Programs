package com.bridgelabz.Junit;

import com.bridgelabz.utility.Utility1;

public class DecimalToBinary {
	public static void main(String[] args) {

		Utility1 utility = new Utility1();

		System.out.println("Enter the Number");
		int no = utility.readInteger();
		utility.DecimalToBinary(no);

	}
}