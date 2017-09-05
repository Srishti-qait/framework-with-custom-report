package com.qait.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class YamlReader {

	static Yaml yaml;
	static InputStream is;
	public static void  setyamlValue(){
	
		String fullfilename ="src/test/resources/testdata/flipkart.yml";			

		File file = new File(fullfilename);

		
		
		try {
			is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		yaml= new Yaml();
		
	}
	
	public static String getProperty(String value){
       	setyamlValue();	
		Map result = (Map) yaml.load(is);	
		return (String) result.get(value);
		
	}
}
