package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(id="Email")
	@CacheLookup
	WebElement txt_Email;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txt_Password;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	@CacheLookup
	WebElement login_btn;
	
	@FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[3]/a")
	@CacheLookup
	WebElement logout_link;
	
	public void setUsername(String uname) {
		txt_Email.clear();
		txt_Email.sendKeys(uname);
	}
	public void setPassword(String password) {
		txt_Password.clear();
		txt_Password.sendKeys(password);
	}
	public void clickonLogin() {
		login_btn.click();
	}
	public void clickonLogout() {
		logout_link.click();
	}
	
}
