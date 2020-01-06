package com.bridgelabz.datastructure;


public class BinarySearchTree {
	public static void main(String[] args) {
		/*
		 * BST bs = new BST(); Node root = null;
		 */
		Utility1	utility	=	new Utility1();

		try {
			
			  System.out.println("Enter a number of testcases "); int cases =
			  utility.readInteger();
			 
			System.out.println("Enter a number of nodes ");

			while (cases != 0) {
				cases--;
				System.out.println(utility.countBinarySearchTree(utility.readDouble()));
			}
		} catch (Exception e) {
			System.out.println(" " + e);
		}
		//System.out.println(Utility.factorial(100));

	}

}