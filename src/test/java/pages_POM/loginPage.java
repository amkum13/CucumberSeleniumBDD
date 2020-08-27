package pages_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		
		if(!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("Not the correct login page.The login page url is: "
					+driver.getCurrentUrl());
		}
	}
	
	By txt_username_login = By.id("name");
	By txt_password_login = By.id("password");
	
	By btn_login = By.id("login");
	By btn_logout = By.id("logout");
	
	public void enterUsername(String username) {
		driver.findElement(txt_username_login).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password_login).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void checkLogoutisDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
	}

	//all action in one function
//	public void loginValidUser(String username, String password) {
//		driver.findElement(txt_username_login).sendKeys(username);
//		driver.findElement(txt_username_login).sendKeys(password);
//		driver.findElement(btn_login).click();
//	}


}
