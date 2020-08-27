package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Chrome browser initiated");
		

	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("http://www.google.com");
		System.out.println("Landed to Google Search page");

	}

	@When("user enters a test in search box")
	public void user_enters_a_test_in_search_box() throws Exception {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Automation");
		Thread.sleep(2000);
		
		
		System.out.println("Automation text passed");

	}

	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		System.out.println("Enter pressed");

	}

	@Then("user navigate to search results")
	public void user_navigate_to_search_results() throws Exception {
		System.out.println("User landed to results page");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.getPageSource().contains("Automation - Wikipedia");
		driver.close();
		driver.quit();

	}

}
