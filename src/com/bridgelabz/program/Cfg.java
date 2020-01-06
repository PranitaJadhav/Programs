package com.bridgelabz.program;
import java.util.*;

class Cfg
{ 
	public static void main(String[] args) 
    { 
        int arr[] = new int[]{1, 5, 0, 19, 11, 25}; 
        int n	=	arr.length;
      
        int diff =arr[0] - arr[1];
        int x=0,i,d;
        if(diff < 0)
             {
        		diff = (diff + (-2*diff));
       }
      
         //Find the min diff by comparing difference 
         //of all possible pairs in given array 
        		for (i=1; i<n-1; i++)
        		{
        				d= arr[i]- arr[i+1];
        					if(d <0)
        						{
        							d += 2*d;
        						}
        					if(d< diff)
        					{
        						diff = d;
        						x= i;//index value
        	}
        }
           
       System.out.println("minimum diff is "+ diff+" indexes are "+ x);  
        
        
 } 

}
	