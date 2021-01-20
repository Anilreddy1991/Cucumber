package pageobjects;

import org.cts.base.BasePage;
import org.openqa.selenium.By;

public class ShoppingLoginPage extends BasePage {
	static By home=By.xpath("//a[@class='active menu_home']");
	static By account=By.xpath("(//span[text()='Account'])[2]");
	static By username=By.id("loginFrm_loginname");
	static By password=By.id("loginFrm_password");
	static By login=By.xpath("//button[@title='Login']");
	static By searchkeyword=By.id("filter_keyword");
	static By go=By.xpath("//div[@title='Go']");
	static By searchkeywords=By.id("filter_keyword");
	static By makeupcategory=By.id("category_36");
	static By searchsymbol=By.xpath("//div[@title='Go']");
			
	
	public static void mouseOverOnHome(){
		mouseOverOnEle(home);
	}
	public static void clickOnAccount(){
		click(account);
	}
	public static void enterUserName(String userName){
		enterText(username, userName);
	}
	public static void enterPassword(String Password){
		enterText(password, Password);
	}
	public static void clickOnLogin(){
		click(login);
	}
	public static void enterKeyword(String data){
		enterText(searchkeyword, data);
	}
	public static void clickOnGo(){
		click(go);
		}
	public static void clickOnSearchKeywords(){
		click(searchkeywords);
	}
	public static void clickOnMakeupCategory(){
		click(makeupcategory);
	}
	public static void clickOnSearchSymbol(){
		click(searchsymbol);
	}
	

}
