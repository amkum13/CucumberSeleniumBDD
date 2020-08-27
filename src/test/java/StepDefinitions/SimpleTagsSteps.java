package StepDefinitions;


import io.cucumber.java.en.Given;



public class SimpleTagsSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("On login page");
	}

	@Given("user enters username and password")
	public void user_enters_username_and_password() {
	    System.out.println("Enetr credentials");
	}

	@Given("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Click enter");
	}


	@Given("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("User navigated to home page");
	}


}
