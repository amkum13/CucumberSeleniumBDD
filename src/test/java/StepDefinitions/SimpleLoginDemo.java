package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleLoginDemo {
	
	WebDriver driver = null;
	
//	@Given("webbrowser is open")
	public void webbrowser_is_open() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Chrome browser initiated");
	}

//	@Given("user is now on login page")
	public void user_is_now_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");
		System.out.println("Landed to login page");
	}

//	@When("user enters his username and password")
//	public void user_enters_his_username_and_password() {
//	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	   driver.findElement(By.id("name")).sendKeys("Amit Kumar");
//	   driver.findElement(By.id("password")).sendKeys("12345");
//	}
//PARAMETARISED ONE	
//	@When("^user enters his (.*) and (.*)$")
	public void user_enters_his_username_and_password(String username, String password) throws Exception {
	   
	   driver.findElement(By.id("name")).sendKeys(username);
	   driver.findElement(By.id("password")).sendKeys(password);
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   Thread.sleep(2000);
	}
	   
//	@When("login button is pressed")
	public void login_button_is_pressed() throws Exception {
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
	}

//	@Then("user navigated to home page")
	public void user_navigated_to_home_page() throws Exception {
		
		driver.findElement(By.id("logout")).isDisplayed();
		String expected = "TestProject Demo";
		String actual = driver.getTitle();

		Assert.assertEquals(expected, actual);
		Thread.sleep(3000);
		System.out.println("Title assert passed");
		System.out.println("Test Completed successully");
		driver.close();
		driver.quit();
	}

}
