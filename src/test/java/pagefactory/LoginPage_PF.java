package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	@FindBy(id="name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login")
	WebElement btn_login;
	
	@FindBy(id="logout")
	WebElement btn_logout;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver = driver;
		//init methos to initialize web elements of the page
		
		PageFactory.initElements(driver, this); //instead of class can use 'this' as well
		
	}

	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickOnLogin() {
		btn_login.click();
	}
	
}

