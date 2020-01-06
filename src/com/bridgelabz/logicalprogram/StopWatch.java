package com.bridgelabz.logicalprogram;
import java.util.*;

//import fellowship.bridgelabz.utility.Utility1;
public class StopWatch{

	public static void main(String[] args) {

		Scanner sc	=	new Scanner(System.in);
		Utility1 utility	=	new Utility1();
		long startTime	=	0;
		long stopTime	=	0;
		
		//Utility1 utility	=	new Utility1();
		
		double result	=	utility.stopWatch(startTime, stopTime) ;
			
		  
		  System.out.println(result);
		}
		
		
	


}
