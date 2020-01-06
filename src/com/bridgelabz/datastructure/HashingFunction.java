package com.bridgelabz.datastructure;


import java.io.File;
//import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


//import com.bridgelabz.fellowship.utility.LinkedListUtility;
//import com.bridgelabz.fellowship.utility.Utility;

public class HashingFunction {
	static Object[] ob = new Object[11];
	LinkList<Integer> ll	=	new LinkList();

	public static void main(String[] args) throws Exception {
		

		for (int i = 0; i < ob.length; i++) {
			ob[i] = new LinkedListUtility<Integer>();
		}
		LinkedListUtility<Integer> input =HashingFunction.inputFromFile();
		for (int i = 0; i < input.size(); i++) {

			LinkedListUtility<Integer> list = (LinkedListUtility<Integer>) ob[i % 11];
			list.add(i);
		}
		
		
		for (int i = 0; i < ob.length; i++) {

			LinkedListUtility<Integer> list = (LinkedListUtility<Integer>) ob[i];
			System.out.println();
			list.display();

		}

		System.out.println();
		System.out.println("Enter a data to search ");
		int data = Utility.integerInput();

		getvalue(data%11,data);
		//Hashing.writeToFile(input));

	}

	public static void getvalue(int key,int data) {
		LinkedListUtility<Integer> list = (LinkedListUtility<Integer>) ob[key];
		if (list.search(data)) {
			list.removeAtIndex((int) list.index(data));

		} else {
			list.add(data);
		}
		list.display();


	}
	public static LinkedListUtility<Integer> inputFromFile() throws Exception
	{
		LinkedListUtility<Integer> intlist = new LinkedListUtility<Integer>();
		File file = new File("/home/bridgeit/Desktop/IntegerFile.text");
		Scanner s = new Scanner(file);
		while (s.hasNextInt())
		{
			intlist.add(s.nextInt());
		}
		return intlist;
	}
	public static void writeToFile(LinkedListUtility<Integer> list) throws Exception
	{
		File file = new File("/home/bridgeit/Desktop/IntegerFile.text");
		FileWriter writer = new FileWriter(file);
		writer.write(" "); writer.flush();
		String str = "";
		int l = list.size();
		//System.out.println(l);list.display();
		while(l!=0)
		{
			str=str+list.pop()+" ";
			l--;
		}
		System.out.println(str);
		writer.write(str);
		writer.flush();
}
}