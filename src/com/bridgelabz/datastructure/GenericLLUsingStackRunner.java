package com.bridgelabz.datastructure;

public class GenericLLUsingStackRunner {

	public static void main(String[] args) {

		GenericStackLLUtility<Integer>gsl	=	new GenericStackLLUtility();
		
		gsl.push(10);
		gsl.push(20);

		gsl.push(30);
		gsl.push(40);
		gsl.push(50);
		
		gsl.display();
		
		gsl.size();

	}

}
