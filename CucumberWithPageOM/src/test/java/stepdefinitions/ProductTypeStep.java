package stepdefinitions;

import java.util.Set;

import org.cts.base.BasePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;
import pageobjects.ProductTypePage;

public class ProductTypeStep {
	@Given("User should be in homepage")
	public void user_should_be_in_homepage() {
	    BasePage.invokeBrowser();
	    BasePage.launchUrl();
	    LoginPage.enterUsername("1234");
	    LoginPage.enterPassword("1234");
	    LoginPage.signIn();
	}

	@When("User select product type option {string}")
	public void user_select_product_type_option(String string) {
	    ProductTypePage.selectProductType(string);
	}

	@And("User select product {string}")
	public void user_select_product(String text) {
	    ProductTypePage.selectProduct(text);
	}

	@And("User click on view datails")
	public void user_click_on_view_datails() {
	    ProductTypePage.clickOnViewDetails();
	}

	@Then("Verify User should navigate Product Detail page")
	public void verify_User_should_navigate_Product_Detail_page() {
		System.out.println(BasePage.driver.getTitle());
	   
	}
	@When("User perform mouseover on shipping")
	public void user_perform_mouseover_on_shipping() {
	    ProductTypePage.mouseOverOnShipping();
	}

	@And("User click on usps")
	public void user_click_on_usps() {
	    ProductTypePage.clickOnUsps();
	}

	@And("User perform mouseover on quick tools")
	public void user_perform_mouseover_on_quick_tools() {
		String mainwindow=BasePage.driver.getWindowHandle();
		Set<String> list=BasePage.driver.getWindowHandles();
		System.out.println(list.size());
		for(String childwindow: list){
		if(!mainwindow.equals(childwindow)){
	    BasePage.driver.switchTo().window(childwindow);
	    ProductTypePage.mouseOverOnQuickTools();
	}
	     }
	}

	@And("User click on find usps locations")
	public void user_click_on_find_usps_locations() {
	   ProductTypePage.clickOnFindUspsLocations();
	}

	@Then("User should navigate to PO Locator page")
	public void user_should_navigate_to_PO_Locator_page() {
	    System.out.println(BasePage.driver.getTitle());
	    BasePage.driver.close();
	}



}
