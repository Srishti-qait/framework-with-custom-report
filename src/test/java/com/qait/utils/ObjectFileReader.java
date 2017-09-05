package com.qait.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ObjectFileReader {
	
	String[] elements;
//	@Test
//	public void test001() throws FileNotFoundException{
//	read_spec_file("Flipkart.spec","search_tab");
//	}
	
	
	public  String[] read_spec_file(String fileName,String elementname){
	
	ClassLoader classLoader = getClass().getClassLoader();
	File file = new File(classLoader.getResource(fileName).getFile());
	try{

		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if(line.startsWith(elementname)){
				line=line.replaceAll("[ \t]+", " ");
				elements=line.split(" ",3);
		
		     }
		
		}
		
		scanner.close();
		}
	catch (IOException e) {
		e.printStackTrace();
	}

		return elements;
	}

}
