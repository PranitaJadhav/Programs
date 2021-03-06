package com.bridgelabz.datastructure;


import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Utility{
	
	
	static Scanner sc = new Scanner(System.in);

	public static int integerInput() {
		return sc.nextInt();
}
	
	public static double doubleInput() {
		return sc.nextDouble();
}
	
	public static String stringInput() {
		return sc.nextLine();
}
	public static float floatInput() {
		return sc.nextFloat();
}
	
	/***************************** tempconversion ************************/
	/**
	 * @param farenh temperature in fahrenheit
	 */
	public static void celsius(float farenh) {
		float c = (farenh - 32) * 5 / 9;
		System.out.println("Temperatur in Celsius " + c);
}
	
	
	/**
	 * @param cels temperature in celsius
	 */
	public static void fahrenheit(float cels) {
		float f = (cels * 9 / 5) + 32;
		System.out.println("Temperature in fahrenheit " + f);

}
	
	/**************************** Monthly Payment *********************/
	/**
	 * @param principal
	 * @param year
	 * @param rate
	 * @return payment
	 */
	public static double monthlyPayment(double principal, int year, float rate) {
		int n = year * 12;
		float r = (float) rate / (12 * 100);
		double payment = (principal * r) / (1 - Math.pow((1 + r), (-n)));
		return payment;
}
	
	/********************************* Vending Machine *********************/

	/**
	 * @param amount User enter a amount in rupees
	 */
	public static void vendingMachine(int amount) {
		int arr[] = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int amount1 = 0;
		int i = 0;
		while (amount > 0) {
			amount1 = amount / arr[i];
			amount = amount % arr[i];
			System.out.println("notes of " + arr[i] + " is " + amount1);
			i++;
		}

}
	/*************************** Coupon Generator ***************************/
	/**
	 * @param codeLength user enter a length of code
	 * @return couponcode
	 */
	public static String createRandomCode(int codeLength) {
		char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new SecureRandom();
		//System.out.println("Enter a number ");
		//int number=Utility.integerInput();
			
		for (int i = 0; i < codeLength; i++) {
			
				char c = chars[random.nextInt(chars.length)];
				sb.append(c);
			
		}
		
		String output = sb.toString();
		return output;
		// System.out.println(output);

	}

/********************* dayOfWeek **********************************/
/**
 * @param date  user enter a date
 * @param month user enter a month
 * @param year  user enter a year
 * @return day
 */
public static int dayOfWeek(int date, int month, int year) {
	int ye = year - (14 - month) / 12;
	int x = ye + ye / 4 - ye / 100 + ye / 400;
	int mo = month + 12 * ((14 - month) / 12) - 2;
	int day = (date + x + (31 * mo) / 12) % 7;

	return day;

}

public static boolean isLeapYear(int year) {
	if ((year % 4 == 0) && (year % 100 != 0))
		return true;
	if (year % 400 == 0)
		return true;
	return false;
}

public static void prime2dArray(int range) {
	int twoDarr[][] = new int[10][25];
	int first = 0, second = 0, third = 0, fourth = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0, tenth = 0;
	int i, j;
	for (i = 2; i < range; i++) {
		int counter = 0;
		for (j = 2; j <= i / 2; j++) {
			if (i % j == 0)
				counter++;

		}

		if (counter == 0) {
			if (i > 0 && i < 101) {
				twoDarr[0][first] = i;
				first++;
			}
			if (i > 100 && i < 201) {
				twoDarr[1][second] = i;
				second++;
			}
			if (i > 200 && i < 301) {
				twoDarr[2][third] = i;
				third++;
			}
			if (i > 300 && i < 401) {
				twoDarr[3][fourth] = i;
				fourth++;
			}
			if (i > 400 && i < 501) {
				twoDarr[4][five] = i;
				five++;
			}

			if (i > 500 && i < 601) {
				twoDarr[5][six] = i;
				six++;
			}
			if (i > 600 && i < 701) {
				twoDarr[6][seven] = i;
				seven++;
			}
			if (i > 700 && i < 801) {
				twoDarr[7][eight] = i;
				eight++;
			}
			if (i > 800 && i < 901) {
				twoDarr[8][nine] = i;
				nine++;
			}

			if (i > 900 && i < 1001) {
				twoDarr[9][tenth] = i;
				tenth++;
			}
		}

	}
	for (int j1 = 0; j1 < 10; j1++) {
		for (int j2 = 0; j2 < 25; j2++) {
			System.out.print(twoDarr[j1][j2] + " ");

		}
		System.out.println();

	}

}

/******************************************************************************/
/**
 * @param number user enter a range
 * @return true or false
 */
public static boolean primeNumber(int number) {
	int i, j;
	for (i = 2; i < number; i++) {
int counter = 0;
		for (j = 2; j <= i / 2; j++) {
			if (i % j == 0)
				counter++;

		}

		if (counter == 0)
			return true;
		else
			return false;

	}
	return true;
}

/****************************************************************************/
/**
 * @param arr array of prime numbers
 * @return array of prime anagram
 */
public static int[] anagramPrime(int arr[]) {
	int primeAnagram[] = new int[arr.length];
	int counter = 0;
	for (int j = 0; j < arr.length; j++) {
		for (int j2 = j + 1; j2 < arr.length; j2++) {

			if (Utility.isAnagram(arr[j], arr[j2]) == true) {
				primeAnagram[counter] = arr[j];
				counter++;
				primeAnagram[counter] = arr[j2];
				counter++;

			}

		}

	}

	return primeAnagram;

}


/*********************************************************/
/**
* @param number  a number
* @param number1 a second number

* @return anagram or not
*/
public static boolean isAnagram(int number, int number1) {
ArrayList<Integer> list = new ArrayList<Integer>();
ArrayList<Integer> list1 = new ArrayList<Integer>();
//int array1[] = new int[200];
//int array2[] = new int[200];

int reminder, reminder1;
boolean flag = false;

while (number1 != 0) {
reminder1 = number1 % 10;
number1 = number1 / 10;
list1.add(reminder1);

}
while (number != 0) {
reminder = number % 10;
number = number / 10;
list.add(reminder);
}

Collections.sort(list);
Collections.sort(list1);
if (list.size() == list1.size()) {
for (int i = 0; i <= list.size() - 1; i++) {

	if (list.get(i) == list1.get(i))

		flag = true;
	else
		return false;
}
}

return flag;

}


public static int[] prime(int number) {
	// ArrayList<Integer> al = new ArrayList<Integer>();
	int arr[] = new int[200];
	int i, j, k = 0;
	for (i = 2; i < number; i++) {
		int counter = 0;
		for (j = i; j >= 1; j--) {
			if (i % j == 0)
				counter++;

		}

		if (counter == 2) {
			arr[k] = i;
			k++;

		}
	}
	return arr;

}

//************************************************8888888

/**
 * @param arr  array of prime numbers
 * @param arr2 array of anagram numbers
 * @return array of nonanagram numbers
 */
public static int[] compareTwo(int arr[], int arr2[]) {

	int arr3[] = new int[arr.length];
	int j = 0, counter = 0;
	for (int i = 0; i < arr.length; i++) {
		int flag = 1;
		for (j = 0; j < arr2.length; j++) {
			if (arr[i] == arr2[j]) {
				flag = 0;
				break;
			} else
				flag = 1;

		}
		if (flag == 1) {

			arr3[counter] = arr[i];
			counter++;

		}

	}

	return arr3;

}

/***************************
 * binarySearchTre
 ************************************/
/**
 * @param node user enter a integer value
 * @return
 */
public static BigInteger countBinarySearchTree(double node) {

	double a = 2 * node;
	double b = node + 1;
	BigInteger x = calculateNode(a);
	BigInteger y = calculateNode(b);
	BigInteger c = calculateNode(node);

	return x.divide(y.multiply(c));

}

///*
// * public static double factorial(double i) { double fact = 1; while (i > 0) {
// * fact = fact * i; i--; } return fact;
// * 
// * }
// */
public static BigInteger calculateNode(double number) {
	BigInteger factorial = BigInteger.ONE;

	for (double i = number; i > 0; i--) {
		factorial = factorial.multiply(BigInteger.valueOf((int) i));
	}

	return factorial;

}

/**
 * @param name     user enter a name
 * @param fullname user enter a fullname
 * @param mobile   user enter a mobile number
 * @param date     user enter a date
 * @param msg      global string
 */
public static void regex(String name, String fullname, String mobile, String date, String msg) {
	String REGEX_name = "<<name>>";
	String REGEX_fullname = "<<full name>>";
	String REGEX_mobile = "xxxxxxxxxx";
	String REGEX_date = "xx/xx/xxxx";
	Pattern p;
	Matcher m;

	p = Pattern.compile(REGEX_name);
	m = p.matcher(msg);
	msg = m.replaceAll(name);

	p = Pattern.compile(REGEX_fullname);
	m = p.matcher(msg);
	msg = m.replaceAll(fullname);

	p = Pattern.compile(REGEX_mobile);
	m = p.matcher(msg);
	msg = m.replaceAll(mobile);

	p = Pattern.compile(REGEX_date);
	m = p.matcher(msg);
	msg = m.replaceAll(date);

	System.out.println("After Replacing :");
	System.out.println();
	System.out.println(msg);

}

}









