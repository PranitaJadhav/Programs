package com.bridgelabz.program;


public class Gambler1 {

	public static void main(String[] args) {

		int stake,trial,goal;
		Utility1 utility	=	new Utility1();
		
		System.out.println("Enter your stake");
		stake	=	utility.readInteger();
		
		System.out.println("Enter your trial");
		trial	=	utility.readInteger();
		
		System.out.println("Enter your goal");
		goal	=	utility.readInteger();
		
		//int cash	=	stake;
		
		int win = utility.gambler(stake, trial, goal);	
		
		System.out.println(win+"	wins of	"+trial);
		
		System.out.println("% of winning	"+win*100/trial);
		
	}

}
