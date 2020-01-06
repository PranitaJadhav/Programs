package com.bridgelabz.logicalprogram;


public class MonthlyPayement {
	public static void main(String[] args) {
		
		Utility1	Utility	=	new Utility1();

		System.out.println("Enter a princpal amount ");
		double principal = Utility.readDouble();
		System.out.println("Enter a years ");
		int years = Utility.readInteger();
		System.out.println("Enter a interest ");
		float interest = Utility.floatInput();
		double payment = Utility.monthlyPayment(principal, years, interest);
		System.out.println("Payment is "+payment);

	}

}