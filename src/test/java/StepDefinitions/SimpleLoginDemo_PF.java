package StepDefinitions;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.LoginPage_PF;
import pagefactory.HomePage_PF;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleLoginDemo_PF {
	
	WebDriver driver = null;
	LoginPage_PF login;
	HomePage_PF home;
	
	@Given("webbrowser is open")
	public void webbrowser_is_open() {
		System.out.println("========IN Page Factory Example, POM must have been commented=======");
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Chrome browser initiated");
	}

	@Given("user is now on login page")
	public void user_is_now_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");
		System.out.println("Landed to login page");
	}

//PARAMETARISED ONE	
	@When("^user enters his (.*) and (.*)$")
	public void user_enters_his_username_and_password(String username, String password) throws Exception {
	   
		login = new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	   //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	   
	@When("login button is pressed")
	public void login_button_is_pressed() throws Exception {
		
		login.clickOnLogin();

	}

	@Then("user navigated to home page")
	public void user_navigated_to_home_page() throws Exception {
		
		home = new HomePage_PF(driver);
		home.checkLogoutisDisplayed();
		
//		String expected = "TestProject Demo";
//		driver.getTitle().equalsIgnoreCase(expected);
		System.out.println("Test Completed successully");
		driver.close();
		driver.quit();
	}

}
