package com.bridgelabz.program;
import java.util.*;

public class ReverseCharacterOfWordOfSentence {
	
	public void reverse(String str) {
		
		String words[]	=	str.split(" ");
		String revString	=	"";
		
		 for(int i=0;i<words.length;i++) {
			 
			 String revWord	=	"";
			 String word	=	words[i];
			 
			 for(int j=word.length()-1;j>=0;j--) {
				 
				 
				 revWord	=	revWord + word.charAt(j);
			 }
			  revString	=	revString+revWord  +" ";
		 }
		System.out.println(str);
		System.out.println(revString);
	}

	public static void main(String[] args) {

		ReverseCharacterOfWordOfSentence s	=	new ReverseCharacterOfWordOfSentence();
		
		String str	=	"Java is a Language";
		
		s.reverse(str);
	}

}
