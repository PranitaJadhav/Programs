package com.bridgelabz.logicalprogram;

public class coupon {
	public static void main (String []args)
	{
		long arr[]=new long[10];
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i]=(int)(Math.random()*1000000000+1000000000);
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}