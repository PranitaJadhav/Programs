package com.bridgelabz.datamanagement;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;

import org.codehaus.jackson.map.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;




public class DataManagementMain {

	public static void main(String[] args) throws IOException  {
		
		//PersonInfo pInfo	=	new PersonInfo();
		
		/*
		 * InputStream input = new FileInputStream(
		 * "/home/bridgeit/Documents/Pranita/FellowShipProgram/src/com/bridgelabz/datamanagement/Demo.json"
		 * ); ObjectMapper mapper = new ObjectMapper(); RiceInfo info =
		 * mapper.readValue(input, RiceInfo.class);
		 * System.out.println("Rice Name"+info.getName());
		 * System.out.println("Price"+info.getPrice());
		 * System.out.println("Weight"+info.getWeight());
		 */
		
		File file	=	new File("/home/bridgeit/Documents/Pranita/FellowShipProgram/src/com/bridgelabz/datamanagement/Demo.json");
		ObjectMapper mapper = new ObjectMapper();
		RiceInfo riceInfo	=	mapper.readValue(file, RiceInfo.class);
		
		System.out.println("RiceName"+riceInfo.getName());
		
		}
	
	
	}


