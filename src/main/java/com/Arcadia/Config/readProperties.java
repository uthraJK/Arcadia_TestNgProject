package com.Arcadia.Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readProperties {

	public static void main(String[] args) throws Exception  {
		
		
		try {
			Properties prop = new Properties();
			FileInputStream input = new FileInputStream("C:\\Users\\Balajee\\eclipse-workspace\\Arcadia\\config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			System.out.println(prop.getProperty("url"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
