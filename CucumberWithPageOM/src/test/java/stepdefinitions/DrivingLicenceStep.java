package stepdefinitions;

import org.cts.base.BasePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.DrivingLicencePage;

public class DrivingLicenceStep {
	@Given("User should be in driving licence")
	public void user_should_be_in_driving_licence() {
	    BasePage.invokeBrowser();
	    BasePage.launchUrl();
	}

	@When("User enter email address {string}")
	public void user_enter_email_address(String emailaddress) {
	    DrivingLicencePage.enterEmailAddress(emailaddress);
	}

	@And("User enter phone number {string}")
	public void user_enter_phone_number(String phoneNumber) {
	   DrivingLicencePage.enterPhoneNumber(phoneNumber);
	}

	@And("User select radio button option {string}")
	public void user_select_radio_button_option(String string) {
	    DrivingLicencePage.selectDrivingLicence();
	}
	@And("User enter applicant name {string}")
	public void user_enter_applicant_name(String applicantName) {
	    DrivingLicencePage.enterApplicantName(applicantName);
	}

	@And("User select relation option {string}")
	public void user_select_relation_option(String text) {
	   DrivingLicencePage.selectRelation(text);
	}

	@And("User click on accept terms and order")
	public void user_click_on_accept_terms_and_order() {
	   DrivingLicencePage.clickOnAcceptTermsAndOrder();
	}

	@Then("User should navigate to Razorpay Checkout page")
	public void user_should_navigate_to_Razorpay_Checkout_page() {
	    System.out.println(BasePage.driver.getTitle());
	}



}
