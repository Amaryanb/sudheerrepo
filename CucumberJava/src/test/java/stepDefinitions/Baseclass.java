package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.apache.commons.lang3.RandomStringUtils;
import pageObjects.LoginPage;
import pageObjects.addCustomerPage;

public class Baseclass {
	public WebDriver driver;
	public LoginPage lp;
	public addCustomerPage addCust;
	
	//Created for generating random string for unique email id
	public static String randomstring() {
		String generatedstring1=RandomStringUtils.randomAlphabetic(5);
		return(generatedstring1);
	}

}
