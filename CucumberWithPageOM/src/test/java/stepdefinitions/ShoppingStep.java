package stepdefinitions;

import org.cts.base.BasePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ShoppingPage;

public class ShoppingStep {
	@Given("User should be in my account page")
	public void user_should_be_in_my_account_page() {
	    BasePage.invokeBrowser();
	    BasePage.launchUrl();
	}

	@When("User perform mouseover on ITEMS")
	public void user_perform_mouseover_on_ITEMS() {
	    ShoppingPage.mouseOverOnItems();
	}

	@And("User click on view cart")
	public void user_click_on_view_cart() {
	   ShoppingPage.clickOnViewCart();
	}
	@And("User click on continue")
	public void user_click_on_continue() {
	    ShoppingPage.clickOnContinue();
	}

	@Then("Verify User should navigate A place to practice your automation skills! page")
	public void verify_User_should_navigate_A_place_to_practice_your_automation_skills_page() {
	    System.out.println(BasePage.driver.getTitle());
	    BasePage.driver.close();
	}



	}
