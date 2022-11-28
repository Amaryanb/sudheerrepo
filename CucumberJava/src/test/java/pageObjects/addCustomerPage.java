package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addCustomerPage {


	public WebDriver ldriver;
	
	public addCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	By txt_email_login = By.id("Email");
	By txt_password_login = By.id("Password");
	By login_btn = By.xpath("//button[normalize-space()='Log in']");
	By customersMenu_link = By.xpath("(//p[contains(text(),'Customers')])[1]");
	By customersMenu_item_link = By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");
	By addnew_btn = By.className("btn btn-primary");
	
	By txt_Email = By.xpath("//a[normalize-space()='Add new']");
	By txt_Password = By.id("Password");
	By first_name = By.id("FirstName");
	By last_name = By.id("LastName"); 
	
	By txtcustomerRoles = By.xpath("//div[@class='k-widget k-multiselect k-multiselect-clearable k-state-border-down']//div[@role='listbox']");
	By lstitems_administrator = By.xpath("//li[normalize-space()='Administrators']");
	By lstitems_forummod = By.xpath("//li[normalize-space()='Forum Moderators']");
	By lstitems_guests = By.xpath("//li[normalize-space()='Guests']");
	By lstitems_vendors = By.xpath("//li[contains(text(),'Vendors')]");
	By lstitems_registered = By.xpath("//*[@id=\"42f1e0c9-4ac3-4f81-834f-fff6ce667113\"]");
	
	By rd_male_gender = By.xpath("//input[@id='Gender_Male']");
	By rd_female_gender = By.xpath("//input[@id='Gender_Female']");
	
	
	By drpmgrofVendor = By.xpath("//select[@id='VendorId']");
	By txt_DOB = By.xpath("//input[@id='DateOfBirth']");
	
	By company_name= By.xpath("//input[@id='Company']");
	By txt_adminComment = By.xpath("//textarea[@id='AdminComment']");
	By save_btn = By.xpath("//button[@name='save']");
	
	// Action methods
	
	public void enterEmail() {
		ldriver.findElement(txt_email_login);
	}
	public void enterPassword() {
		ldriver.findElement(txt_password_login);
	}
	public String getPageTitle() {
		return ldriver.getTitle();
	}
	public void clickOnCustomersMenu() {
		ldriver.findElement(customersMenu_link);
	}
	public void clickOnCustomersMenuItem() {
		ldriver.findElement(customersMenu_item_link);
	}
	public void clickOnAddNew() {
		ldriver.findElement(addnew_btn);
	}
	public void setEmail(String email) {
		ldriver.findElement(txt_Email).sendKeys(email);
	}
	public void setPassword(String password) {
		ldriver.findElement(txt_Password).sendKeys(password);
	}
		
	public void setFirstname(String fname) {
		ldriver.findElement(first_name).sendKeys(fname);
	}
	public void setLastname(String lname) {
		ldriver.findElement(last_name).sendKeys(lname);
	}
	public void setGender(String gender) {
		if(gender.equals("Male")) {
			ldriver.findElement(rd_male_gender).click();	
		}
		else if(gender.equals("Female")) {
			ldriver.findElement(rd_female_gender).click();
		}else {
			ldriver.findElement(rd_male_gender).click();// default
		}
	}
	public void setManagerofVendor(String value) {
		Select drp = new Select(ldriver.findElement(drpmgrofVendor));
		drp.selectByVisibleText(value);
	}
	public void setCustomerRoles(String role) throws InterruptedException {
		ldriver.findElement(txtcustomerRoles).click();
		
		WebElement listitem;
		Thread.sleep(3000);
		if(role.equals("Administrators")) {
			listitem = ldriver.findElement(lstitems_administrator);
		}
		else if(role.equals("Guests")) {
			listitem = ldriver.findElement(lstitems_guests);
		}
		else if(role.equals("Registered")) {
			listitem = ldriver.findElement(lstitems_registered);
		}
		else if(role.equals("Vendors")) {
			listitem= ldriver.findElement(lstitems_vendors);
		}
		else {
			listitem=ldriver.findElement(lstitems_guests);
		}
		listitem.click();
		
		JavascriptExecutor js = (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();", listitem);
	}
	public void setDOB(String dob) {
		ldriver.findElement(txt_DOB).sendKeys(dob);
	}
	public void setCompanyName(String comname) {
		ldriver.findElement(company_name).sendKeys(comname);
	}
	public void setAdmintcomment(String content) {
		ldriver.findElement(txt_adminComment).sendKeys(content);
	}
	public void clickOnSave() {
		ldriver.findElement(save_btn).click();
	}
}
