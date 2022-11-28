package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.LoginPage;
import pageObjects.addCustomerPage;

public class Loginsteps extends Baseclass {
	

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver", "D:\\EclipseNewWorkspace\\CucumberJava\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    lp = new LoginPage(driver);
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("user enters Email as {string} and Password as {string}")
	public void user_enters_email_and_password_as(String email, String password) {
		
	    lp.setUsername(email);
	    lp.setPassword(password);
	   
	}
	
	@When("click on login")
	public void click_on_login(){
	    lp.clickonLogin();
	   
	}

	@Then("user can view dashboard")
	public void user_can_view_dashboard()  {
	    addCust = new addCustomerPage(driver);
	    //Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
	    if(driver.getPageSource().contains("Dashboard / nopCommerce administration")) {
			   System.out.println("Dashboard is correct");
		   }
		   else {
			   System.out.println("Dashboard verification is failed");
		   }
	    
	}
	@When("user click on customers menu")
	public void user_click_on_customers_menu() throws InterruptedException {
		Thread.sleep(3000);
	    addCust.clickOnCustomersMenu();
	}

	@When("click on customers menu item")
	public void click_on_customers_menu_item() {
	   addCust.clickOnCustomersMenuItem();
	}

	@When("click on add new button")
	public void click_on_add_new_button() {
	    addCust.clickOnAddNew();
	}

	@Then("user can view add new customer page")
	public void user_can_view_add_new_customer_page() {
	    Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
	
	}

	@When("user enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
	    String email = randomstring()+"@gmail.com";
	    addCust.setEmail(email);
	    addCust.setPassword("test123");
	    addCust.setCustomerRoles("Guest");
	    Thread.sleep(3000);
	    addCust.setManagerofVendor("Vendor 2");
	    addCust.setGender("Male");
	    addCust.setFirstname("Amarnath");
	    addCust.setLastname("Naik");
	    addCust.setCompanyName("Wipro");
	    addCust.setDOB("12/07/1998");
	    addCust.setAdmintcomment("This is for testing.........");
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
	    addCust.clickOnSave();
	    Thread.sleep(3000);
	}

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String msg) {
	    Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully."));
	} 
	
	
	// steps for searching a customer using email id....

	@Then("close browser")
	public void close_browser() {
	    driver.quit();
	}

	
	
}
