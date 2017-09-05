package com.qait.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qait.keywords.GmailPageAction;
import static com.qait.utils.YamlReader.getProperty;
import com.qait.utils.YamlReader;
public class TestSessionInitiator {
	WebDriver driver;
	public TestSessionInitiator()
	{
		initialise();
	}
	
	public GmailPageAction fk;
	
	public void init(){
		fk= new GmailPageAction(driver);
	}
public void configBrowser(){
	System.setProperty("webdriver.chrome.driver",
			"src/test/resources/selenium-drivers/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get(getProperty("Base_URL"));
	  // System.out.println(getProperty("Email"));
}

public void initialise(){
	YamlReader.setyamlValue();
	 configBrowser();
	 init();
	 
}
}
