package com.bridgelabz.logicalprogram;
import java.util.*;
import java.util.Scanner;
public class DectoBin {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int []a = new int[100];
	
	System.out.println("enter num to convert");
	int num=sc.nextInt();
	int i=0;
	int j=0;
	while(num>0)
	{ 
	
		a[i]=num%2;
	    num=num/2;
	    i++;
		    
	}
	for( j=i-1;j>=0;j--);
	{
		System.out.println(a[j]);
	}
}
}
