package stepdefinitions;

import org.cts.base.BasePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;
import pageobjects.ProductsPage;

public class ProductsStep {
	@Given("User should be in home page")
	public void user_should_be_in_home_page() {
	   BasePage.invokeBrowser();
	   BasePage.launchUrl();
	   LoginPage.enterUsername("1234");
	   LoginPage.enterPassword("1234");
	   LoginPage.signIn();
	}

	@When("User perform mouseover on products")
	public void user_perform_mouseover_on_products() {
	   ProductsPage.products();
	}

	@And("User click on beverages")
	public void user_click_on_beverages() {
	    ProductsPage.beverages();
	}

	@And("User click on chai product")
	public void user_click_on_chai_product() {
	   ProductsPage.chai();
	}

	@And("User click on order")
	public void user_click_on_order() {
	    ProductsPage.order();
	}

	@And("User click on edit your cart")
	public void user_click_on_edit_your_cart() {
	    ProductsPage.editYourCart();
	}

	@And("User remove cote de blaye product")
	public void user_remove_cote_de_blaye_product() {
	    ProductsPage.remove();
	}

	@And("User click on next")
	public void user_click_on_next() {
	    ProductsPage.next1();
	}

	@And("User enter firstname {string}")
	public void user_enter_firstname(String firstName) {
	    ProductsPage.fname(firstName);
	}

	@And("User enter lastname {string}")
	public void user_enter_lastname(String lastName) {
	    ProductsPage.lname(lastName);
	}

	@And("User enter companyname {string}")
	public void user_enter_companyname(String companyName) {
	   ProductsPage.companyname(companyName);
	}

	@And("User enter street address {string}")
	public void user_enter_street_address(String streetAddress) {
	    ProductsPage.streetaddress(streetAddress);
	}

	@And("User enter zip code {string}")
	public void user_enter_zip_code(String zipCode) {
	    ProductsPage.zipcode(zipCode);
	}

	@And("User enter area code {string}")
	public void user_enter_area_code(String areaCode) {
	    ProductsPage.areacode(areaCode);
	}

	@And("User enter primary phone {string}")
	public void user_enter_primary_phone(String primaryPhone) {
	   ProductsPage.primaryphone(primaryPhone);
	}
	@And("User click on Ship to Billing Address")
	public void user_click_on_Ship_to_Billing_Address() {
	    ProductsPage.shipbillingaddress();
	}
	@And("User click on next1")
	public void user_click_on_next1() {
	    ProductsPage.next2();
	}
	@And("User select card type option {string}")
	public void user_select_card_type_option(String text) {
	    ProductsPage.cardType(text);
	}

	@And("User enter Security Code {string}")
	public void user_enter_Security_Code(String data) {
	    ProductsPage.securitycode(data);
	}

	@And("User enter Card Number {string}")
	public void user_enter_Card_Number(String data) {
	    ProductsPage.cardnumber(data);
	}

	@And("User select Expiration Month option {string}")
	public void user_select_Expiration_Month_option(String text) {
	    ProductsPage.expirymonth(text);
	}

	@And("User select Expiration Year option {string}")
	public void user_select_Expiration_Year_option(String text) {
	   ProductsPage.expiryyear(text);
	}

	@And("User click on Submit")
	public void user_click_on_Submit() {
	   ProductsPage.submit();
	}

	
 @Then("Verify User should navigate Thank you for placing an order with ACME!")
	public void verify_User_should_navigate_Thank_you_for_placing_an_order_with_ACME() {
	 System.out.println(BasePage.driver.getTitle());
		BasePage.driver.close();
	}
}
