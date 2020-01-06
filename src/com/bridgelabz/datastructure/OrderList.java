package com.bridgelabz.datastructure;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class OrderList {
	// to read input from file
	public static OrderedLinkedList inputFromFile() throws Exception
	{
		OrderedLinkedList list = new OrderedLinkedList();
		File file = new File("/home/bridgeit/Desktop/IntegerFile.text");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(file);
		while (s.hasNextInt())
		{
			list.add(s.nextInt());
		}
		return list;
	}
	// to write into the file
	public static void writeToFile(OrderedLinkedList list) throws Exception
	{
		File file = new File("/home/bridgeit/Desktop/IntegerFile.text");
		@SuppressWarnings("resource")
		FileWriter writer = new FileWriter(file);
		writer.write(" "); writer.flush();
		String str = "";
		int l = list.size();
		System.out.println(l);
		list.display();
		while(l!=0)
		{
			str=str+list.pop()+" ";
			l--;
		}
		System.out.println(str);
		writer.write(str);
		writer.flush();
	}
	public static void main(String[] args) throws Exception 
	
	{
		AllUtility	ul	=	new AllUtility();
		//OrderedLinkedList input 	=	new OrderedLinkedList();
		OrderedLinkedList input = OrderList.inputFromFile();
		System.out.println("Enter the value you want to search");
		
		int ele=ul.readInteger();
		if(input.search(ele))
		{
			input.remove(ele);
		}
		else input.add(ele);
		OrderList.writeToFile(input);

	}
}