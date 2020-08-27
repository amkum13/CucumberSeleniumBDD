package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	
	WebDriver driver;
	
	@FindBy(id="logout")
	WebElement btn_logout;
	
	public HomePage_PF(WebDriver driver) {
		this.driver= driver;
		
		PageFactory.initElements(driver, this); //instead of class can use 'this' as well
		
	}
	
	public void checkLogoutisDisplayed(){
		btn_logout.isDisplayed();
		
	}
}
