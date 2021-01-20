package pageobjects;

import org.cts.base.BasePage;
import org.openqa.selenium.By;

public class ProductTypePage extends BasePage {
	static By producttype=By.id("productType");
	static By product=By.id("productsList");
	static By viewdetails=By.id("viewButton");
	static By shipping=By.linkText("Shipping");
	static By usps=By.linkText("USPS");
	static By quicktools=By.xpath("//li[@class='qt-nav menuheader']");
	static By uspslocations=By.xpath("//img[@alt='Post Office Locator Icon']");
	
	public static void selectProductType(String text){
		handleDropDowbByText(producttype, text);
	}
	public static void selectProduct(String text){
		handleDropDowbByText(product, text);
	}
	public static void clickOnViewDetails(){
		click(viewdetails);
	}
	public static void mouseOverOnShipping(){
		mouseOverOnEle(shipping);
	}
	public static void clickOnUsps(){
		click(usps);
	}
	public static void mouseOverOnQuickTools(){
		mouseOverOnEle(quicktools);
	}
	public static void clickOnFindUspsLocations(){
		click(uspslocations);
	}

}
