package com.bridgelabz.program;


public class coupon2 {

	public static void main(String[] args) {
		
		Utility1 utility	=	new Utility1();
		
		


		char ch[]	=	"abcdefghijklmnopqrstuvwxyz123456789".toCharArray();
		
		String couponCode	=	utility.coupon(ch);
		  
		  System.out.println("Coupon code is  "+couponCode);
	}

}
