package com.bridgelabz.program;

public class Demo {
     
	public static void main(String args[]) {
        
    int[] x ={10,11,12,13,14,6,3,1};
     
            int small=x[0];
     
     for(int i=0;i<x.length;i++)
     {
            if(x[i]<small)
            {
            small=x[i];
            }
     }
     
       int sec_Small=x[0];
     
    for(int i=0;i<x.length;i++)
     {
            if(x[i]<sec_Small && x[i]!=small)
            {
            sec_Small=x[i];
            }
      }
     
            System.out.println("Second Smallest Number: "+sec_Small);
            System.out.println("Second Smallest Number: "+small);

            }
    }




