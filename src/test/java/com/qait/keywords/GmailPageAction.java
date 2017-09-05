package com.qait.keywords;

import org.openqa.selenium.WebDriver;
//import com.qait.utils.YamlReader;
import static com.qait.utils.YamlReader.getProperty;

import com.qait.utils.GetPage;

public class GmailPageAction extends GetPage {
	public GmailPageAction(WebDriver driver)
	{
		super(driver,"Flipkart.spec");
	}
	public void login() throws InterruptedException
	{
		element("enter_mail").sendKeys(getProperty("Email"));
		Thread.sleep(2000);
		element("submit_id").click();
		Thread.sleep(4000);
		element("enter_password").sendKeys(getProperty("Password"));
		element("submit_mail").click();
		
	}

}
