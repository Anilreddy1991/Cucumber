package stepdefinitions;

import org.cts.base.BasePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;

public class Login_Step {
	@Given("User should be in login page")
	public void user_should_be_in_login_page() {
	   BasePage.invokeBrowser();
	   BasePage.launchUrl();
	}

	@When("User enter username {string}")
	public void user_enter_username(String userName) {
	   LoginPage.enterUsername(userName);
	}

	@And("User enter password {string}")
	public void user_enter_password(String Password) {
	   LoginPage.enterPassword(Password);
	}

	@And("User click on {string}")
	public void user_click_on(String SignIn) {
	    LoginPage.signIn();
	}
	


	@Then("Verify User should navigate to home page")
	public void verify_User_should_navigate_to_home_page() {
		System.out.println(BasePage.driver.getTitle());
		BasePage.driver.close();
	    
	}
	



}
