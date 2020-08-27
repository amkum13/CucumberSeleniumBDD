package StepDefinitions;

import java.util.concurrent.TimeUnit; 


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages_POM.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleLoginDemo_POM {
	
	WebDriver driver = null;
	loginPage login ;
	
//	@Given("webbrowser is open")
	public void webbrowser_is_open() {
		
		System.out.println("------------Non POM Step Definition Class SimpleLoginDemo has to be commented-----------");
		System.out.println("------------IN POM Step Definition Class-----------");
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		System.out.println("Chrome browser initiated");
	}

//	@Given("user is now on login page")
	public void user_is_now_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Landed to login page");
	}

//	@When("^user enters his (.*) and (.*)$")
	public void user_enters_his_username_and_password(String username, String password) throws Exception {
		
		//creating object of loginPage --POM class and passing the drive instance to its constructor
		
		login = new loginPage(driver);		
		login.enterUsername(username);
		login.enterPassword(password);
	   
//	   driver.findElement(By.id("name")).sendKeys(username);
//	   driver.findElement(By.id("password")).sendKeys(password);
	}
	   
//	@When("login button is pressed")
	public void login_button_is_pressed() throws Exception {
		
	    login.clickLogin();
		//driver.findElement(By.id("login")).click();
	}

//	@Then("user navigated to home page")
	public void user_navigated_to_home_page() throws Exception {
		
		login.checkLogoutisDisplayed();
		
		//driver.findElement(By.id("logout")).isDisplayed();

		System.out.println("Test Completed successully");
		driver.close();
		driver.quit();
	}

}
