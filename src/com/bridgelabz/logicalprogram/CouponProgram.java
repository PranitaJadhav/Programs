package com.bridgelabz.logicalprogram;

import java.security.SecureRandom;
import java.util.Random;

public class CouponProgram {

	
		public static String createRandomCode(int codeLength){   
		     char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
		     
		     
		        StringBuilder sb = new StringBuilder();
		        
		        
		        Random random = new Random();
		        
		        
		        for (int i = 0; i < codeLength; i++) {
		            char c = chars[random.nextInt(chars.length)];
		            
		            sb.append(c);
		            
		        }
		        
		        String output = sb.toString();
		        
		        System.out.println(output);
		        
		        return(output);
		        
		    }
		public static void main(String[] args) {
			
			createRandomCode(6);
		}

	}


