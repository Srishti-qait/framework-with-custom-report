package com.qait.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qait.utils.ObjectFileReader;

public class GetPage {
	WebDriver driver;
	ObjectFileReader obr = new ObjectFileReader();
	static String pageName;

	public GetPage(WebDriver driver, String fileName)

	{

		this.driver = driver;
		this.pageName = fileName;
	}

	public WebElement element(String elementname) {

		String[] elem = obr.read_spec_file(pageName, elementname);
		String a = elem[1];
		String b = elem[2];
		return driver.findElement(getValue(a, b));

	}

	public enum Locators {
		id, name, classname, css, xpath, linktext;
	}

	protected By getValue(String locatortype, String locatortvalue) {
		switch (Locators.valueOf(locatortype)) {
		case css:
			return By.cssSelector(locatortvalue);
		case xpath:
			return By.xpath(locatortvalue);
		default:
			return null;

		}

	}
}
