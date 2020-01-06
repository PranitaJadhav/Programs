package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility1 {

	
	Scanner sc	=	new Scanner(System.in);
	
	
	//********************read integer value*********************
	
	public int readInteger() {
		return sc.nextInt();
		}
	//********************read double value*********************
	
	public double readDouble() {
			return sc.nextDouble();
}
		
		//********************read String value*********************
		
	public String readString() {
			 return sc.nextLine();
	}
		
	public  float floatInput() {
		return sc.nextFloat();
	}
		
		
	//************** Binary search for string***********************8

		public int binarySearch(String key, String[] str) {

			int n = str.length;
			int max = n - 1;
			int min = 0;
			int mid = (max - min) / 2;

			while (min <= max) {

				mid = (min - max) / 2;

				if (str[mid].compareTo(key) == 0) {

					return mid;

				}

				else if (str[mid].compareTo(key) > 0) {

					// B(98) > A(97) then shift max to mid-1
					// if diff is greater than 0 shift max to mid-1
					max = mid - 1;

				}

				else {

					min = mid + 1;// if diff is less than 0 shift min to mid+1

				}

			}

			return 1;
		}

	//**************** Binary search for no***********

		public int binarySearchForNo(int arr[], int ele) {
			int n = arr.length;
			int li = 0, hi = n - 1;

			int mid = (li + hi) / 2;

			while (li <= hi) {

				if (arr[mid] == ele) {

					return mid;

				} else if (arr[mid] < ele) {

					li = mid + 1; // if diff is less than 0 shift li to mid+1

				}

				else {

					hi = mid - 1; // if diff is greater than 0 shift max to mid-1

				}

				mid = (li + hi) / 2;
			}

			return 1;
		}
//*********************is prime method

 static boolean checkPrime1(int n){  
	  int i,m=0,flag=0;      
	        
	  if(n==0||n==1){  
		  
		  
	   //System.out.println(n+" is not prime number");  
		  return false;
		  
		  
	  }
	  
	  else{  
		  
		  
	   for(i=2;i<=n;i++){
		   
		   
	    if(n%i==0){ 
	    	
	    	
	     //System.out.println(n+" is not prime number");      
	     return false;    
	     
	     
	     
	    }   
	    
	    
	   } 
	   
	   
	   if(flag==0)  { 
		   
		   //System.out.println(n+" is prime number");
		   
		   return true;
	   
	   }  
	  }//end of else 
	return false;
	  
	  
	  
	  
	}  


//**************Decimal to Bianry********************

	public int DecimalToBinary(int dec) {

		int[] arr;

		while (true) {
			if (dec == 0) {

				break;
			} else {

				int temp = dec % 2;// it gives 0 or 1

				System.out.print(temp);

				dec = dec / 2;
			}
		}
		return 0;

	}
	/********************************* Vending Machine *********************/

	/**
	 * @param amount User enter a amount in rupees
	 */
	public static void vendingMachine1(int amount) {
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

	/**************************** Monthly Payment *********************/
	/**
	 * @param principal
	 * @param year
	 * @param rate
	 * @return payment
	 */
	public static double monthlyPayment1(double principal, int year, float rate) {
		int n = year * 12;
		float r = (float) rate / (12 * 100);
		double payment = (principal * r) / (1 - Math.pow((1 + r), (-n)));
		return payment;
	}
//***********check prime**********8
 /**
  * @param number
  	@return true or false
  */
public  boolean checkPrime(int number){
	int j=2;
	for(j=2; j<=number; j++){
		if(number%j==0)
			break;
	}
	if(number == j){
		return true;
	}		
	return false;
}


/* @param Array list
	@return array list
*/
public static List<Integer> intAnagramList(List<Integer> list){
	List<Integer> newList = new ArrayList<>();
	for(Integer i : list){
		String str1 = Integer.toString(i);
		char[] arr1 = str1.toCharArray();
		Arrays.sort(arr1);
		int number = 0;
		for(Integer j : list){
			if(j==i)
				continue;
			String str2 = Integer.toString(j);
			char[] arr2 = str2.toCharArray();
			Arrays.sort(arr2);				
			if(Arrays.equals(arr1, arr2)) {
				if(number == i) //Should Not Add 1 number twice
					continue;
				newList.add(i);
				number = i;
			}//if				
		}//for
	}
	return newList;
}//intanagram

/**
 * @param number
 	@return prime number or 0
 */
public static  int checkPrime11(int number){
	int j=2;
	for(j=2; j<=number; j++){
		if(number%j==0)
			break;
	}
	if(number == j){
		return number;
	}		
	return 0;
}



/**
 * @param string
 * @param string
 	@return true or false
 */

 public static boolean isAnagramInteger(String str,String str1) {
	
	char[] ch	=	str.toCharArray();
	char[] ch1	=	str1.toCharArray();
	 if(str.length()!=str1.length()) {
		  
		  return false;
	  }
	
	 
	  
	  else {
		  Arrays.sort(ch);
		  Arrays.sort(ch1);
		  
		  if(Arrays.equals(ch, ch1)) {
			  
			  return true;
		  }
	  }
	
	return false;
	

        }

	
	  public Utility1(){ 
		  		   BufferedReader br = new BufferedReader(new
				  InputStreamReader(System.in));
		  }
	 
	  /** Read the integer file
	   * @param file name
	   * */
	  
	  public String getFileText(String fileName){
	
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		  try{
		
				br=new BufferedReader(new FileReader(fileName));
				StringBuilder sb=new StringBuilder();
				String line=br.readLine();
				while(line!=null){
					sb.append(line);
					sb.append(System.lineSeparator());
					line=br.readLine();
				}
		return sb.toString();
	 }
		catch(Exception exception){
			return null;
		}
		finally{
				try{
					br.close();
				}
				catch(IOException exception){
				}	
			}
}
/** Read the integer file
 
 */
public static   int[] integerFileReader()
{
	
	String[] stringArray;
    int[] intArray=null;

	try
	{
		String intFile = new String();
		FileReader fr = new FileReader("integer.txt");
		BufferedReader br = new BufferedReader(fr);
	    String s;

	    while((s = br.readLine()) != null) 
		{
	        intFile += s;
	    }

	    intFile = intFile.replaceAll("\\n",",");
	    intFile = intFile.trim();
	    stringArray = intFile.split(","); 
	    intArray = new int[stringArray.length];

	    for(int i=0; i <intArray.length;i++)
	    {
	        try
	        {
	            intArray[i]= Integer.parseInt(stringArray[i]);
	        }
	        catch(NumberFormatException e)
	        {
	            System.out.println(e);
	        }
	    }
	}
	catch(Exception obj)
	{
	    System.out.println("e");
	}
    	return intArray;
}

/**
 * @param Array
 	@return sorted array
 */
public int[] sort(int[] arr )
{
	int size=arr.length;
	for(int i=size;i>0;i--)
	{
  		for(int j=1;j<size;j++)
		{
    		if(arr[j-1]>arr[j])
			{
      			int temp=arr[j-1];
      			arr[j-1]=arr[j];
      			arr[j]=temp;
    		}
  		}
  		size--;
	}
	return arr;
	}//


public static int[] readFile() {
	
	  try {
		  
		   File f	=	new File("/home/bridgeit/Desktop/IntegerFile.text");
		   Scanner sc	=	new Scanner(f);
		   int count	=	0;
		     while(sc.hasNext()) {
		    	 
		    	 count++;
		    	 sc.nextInt();
		     }
		     
		     int[] arr	=	new int[count];
		     Scanner s	=	new Scanner(f); 
		     
		     for(int i = 0; i < arr.length; i++) {
		    	 
		    	 arr[i]	=	s.nextInt();
		     }
		  return arr;
	  }
	  
	  catch(Exception e){
		  
		  e.printStackTrace();
		  return null;
	  }
	
	
	
	
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

		if (Utility1.isAnagram(arr[j], arr[j2]) == true) {
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
//* public static double factorial(double i) { double fact = 1; while (i > 0) {
//* fact = fact * i; i--; } return fact;
//* 
//* }
//*/
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
			
			//create pattern to be searched
			p = Pattern.compile(REGEX_name);
			
			//search above pattern
			m = p.matcher(msg);
			
			//Replace the string
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









