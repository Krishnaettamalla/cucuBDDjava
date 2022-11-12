package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("inside step user is on login page");
		}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user entering credentials");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("user clicked on login button");
	}

	@Then("user navigated to the home page")
	public void user_navigated_to_the_home_page() {
		System.out.println("user is in home page");
	}

}
