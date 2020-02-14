package com.Arcadia.Driverclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.Arcadia.Utility.BaseClass;

public class BrowserFactory extends BaseClass{

	public static WebDriver driver;
	public static Properties prop;

	public BrowserFactory() {
		try {
			prop = new Properties();
			FileInputStream input = new FileInputStream(
					"C:\\Users\\Balajee\\eclipse-workspace\\Arcadia\\src\\main\\java\\com\\Arcadia\\Config\\config.properties");
			prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Balajee\\eclipse-workspace\\Arcadia\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
	}else if(browserName.equalsIgnoreCase("FireFox"))
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Balajee\\eclipse-workspace\\Arcadia\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}else
	{
		System.setProperty("webdriver.IE.driver",
				"C:\\Users\\Balajee\\eclipse-workspace\\Arcadia\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	}	

}
