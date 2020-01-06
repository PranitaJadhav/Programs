package com.bridgelabz.program;

public class MergeSort {

	int[] arr;
	int[]tempArray;
	int length;
	
	public static void main(String[] args) {
		int[] array = {11,77,22,66,33};
		MergeSort ms	=	new MergeSort();
		ms.sort(array);

	}

	public int[] sort(int[] array) {
		 this.arr	=	array;
		 this.length	=	array.length;
		 //this.	=	new int[length];
		 
		
		return array;
		
		
	}
}
