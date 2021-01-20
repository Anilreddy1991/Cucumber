package stepdefinitions;

import org.cts.base.BasePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.ShoppingLoginPage;

public class ShoppingLoginStep {

@Given("User should be in shopping cart Page")
public void user_should_be_in_shopping_cart_Page() {
    BasePage.invokeBrowser();
    BasePage.launchUrl();
}

@When("User Perform mouseover on home")
public void user_Perform_mouseover_on_home() {
    ShoppingLoginPage.mouseOverOnHome();
}

@And("User click on account")
public void user_click_on_account() {
    ShoppingLoginPage.clickOnAccount();
}

@And("User enter login name {string}")
public void user_enter_login_name(String userName) {
   ShoppingLoginPage.enterUserName(userName);
}
@And("User enter login password {string}")
public void user_enter_login_password(String Password) {
    ShoppingLoginPage.enterPassword(Password);
}

@And("User click on login")
public void user_click_on_login() {
    ShoppingLoginPage.clickOnLogin();
}

@Then("Verify User should navigate homepage")
public void verify_User_should_navigate_homepage() {
    System.out.println(BasePage.driver.getTitle());
    BasePage.driver.close();
}
@Given("User is on search box")
public void user_is_on_search_box() {
	BasePage.invokeBrowser();
    BasePage.launchUrl();
    
}

@When("User enter product name {string}")
public void user_enter_product_name(String data) {
    ShoppingLoginPage.enterKeyword(data);
}

@And("User click on Go button")
public void user_click_on_Go_button() {
    ShoppingLoginPage.clickOnGo();
}

@Then("Verify User should navigate Womens high heel point page")
public void verify_User_should_navigate_Womens_high_heel_point_page() {
	System.out.println(BasePage.driver.getTitle());
	BasePage.driver.close();
	}
@When("User click on search keywords box")
public void user_click_on_search_keywords_box() {
   ShoppingLoginPage.clickOnSearchKeywords();
}
@And("User click on makeup category")
public void user_click_on_makeup_category() {
    ShoppingLoginPage.clickOnMakeupCategory();
}

@And("User click on search symbol")
public void user_click_on_search_symbol() {
    ShoppingLoginPage.clickOnSearchSymbol();
}

@Then("Verify User should navigate search criteria page")
public void verify_User_should_navigate_search_criteria_page() {
	System.out.println(BasePage.driver.getTitle());
	BasePage.driver.close();
}


}
