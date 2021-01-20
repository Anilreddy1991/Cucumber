package pageobjects;

import org.cts.base.BasePage;
import org.openqa.selenium.By;

public class ShoppingPage extends BasePage {
	
	 static By items=By.xpath("(//a[@class='dropdown-toggle'])[2]");
	 static By viewcart=By.xpath("//a[@title='View Cart']");
	 static By Continue=By.xpath("//a[@title='Continue']");
	 
	 public static void mouseOverOnItems(){
		mouseOverOnEle(items);
	 }
	 public static void clickOnViewCart(){
		 click(viewcart);
	 }
	 public static void clickOnContinue(){
		 click(Continue);
	 }

} 
