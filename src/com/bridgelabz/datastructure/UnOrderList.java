package com.bridgelabz.datastructure;


import java.io.BufferedReader;

import java.io.FileReader;

//import com.bridgelabz.DataStructureProgram.LinkListUtility;

public class UnOrderList {
	public static void main(String[] args) throws Exception {

		AllUtility utility   			=	new AllUtility();
		LinkList<String> ll 		= new LinkList();

		int index;
		String name;
		String line;

		int count = 0;

		String[] words = new String[10];

		// Opens a file in read mode Word

		FileReader file = new FileReader("/home/bridgeit/Desktop/file.text");

		BufferedReader br = new BufferedReader(file);

		// Gets each line till end of file is reached

		while ((line = br.readLine()) != null) {
			// Splits each line into words

			words = line.split(" ");

			// Counts each word

			count = count + words.length;
		}

//	System.out.println("Number of words present in given file: " + count);

		System.out.println("---Words present in given file---");

		

		for (int i = 0; i < words.length; i++) {
			String str = words[i];

			ll.insert(str);
		}
		 
		ll.show();
		
		//************to delete***************************************
		/*
		 * System.out.println("Write the word u want to delete");
		 * 
		 * name = utility.readString(); ll.searchedEleDelete(name);
		 * 
		 * ll.show();
		 */
		 
		//*********************to insert at begin*********************  
		
		  System.out.println("Write the word u want to insert at begin"); 
		   name= utility.readString(); ll.insertAtBegin(name);
		   ll.show();
		 
		  
		  
		  
		  //********************* insert at index*************
		   System.out.println("Write the word u want to insert");
		    name	=	utility.readString();
		   
		   System.out.println("Index where you want to insert");

		    index	=	utility.readInteger();
		   ll.inserAtIndex(index, name);;
		   ll.show();
		   
		   
		   //**************delete at index************
		   System.out.println("Enter the index you want to delete");
		   index	=	utility.readInteger();
		   ll.deletAt(index);
		   ll.show();
		   
		  

		   
		
		   
			//System.out.println("word is not found");
		}

	}