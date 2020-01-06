package com.bridgelabz.program;
import java.util.*;

public class Trigo {

	public static void main(String[] args) {

		 Scanner sc	=	new Scanner(System.in);
		 System.out.println("Enterthe angle");
		 
		  double a	=	sc.nextDouble();
		  double rad	=	Math.toRadians(a);
		  double sin	=	Math.sin(a);
		  double cos	=	Math.cos(a);
		  
		  System.out.println(+sin);
		  System.out.println(+cos);
		 
	}

}
