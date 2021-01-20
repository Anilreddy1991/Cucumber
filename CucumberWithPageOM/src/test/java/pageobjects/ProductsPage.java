package pageobjects;

import org.cts.base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {
	static By products=By.linkText("Products");
	static By beverages=By.linkText("Beverages");
	static By chai=By.linkText("Chai");
	static By order=By.name("Order");
	static By edityourcart=By.name("edit_your_cart");
	static By remove=By.linkText("Remove");
	static By next1=By.xpath("(//input[@value='Next'])[1]");
	static By firstname=By.id("bfirst_name");
	static By lastname=By.id("blast_name");
	static By companyname=By.id("bcompany_name");
	static By streetaddress=By.id("bstreet_address");
	static By zipcode=By.id("bzip_code");
	static By areacode=By.id("barea_code");
	static By primaryphone=By.id("bprimary_phone");
	static By shiptobillingaddress=By.id("ship_to_bill");
	static By next2=By.xpath("(//input[@value='Next'])[2]");
	static By cardtype=By.id("card_type");
	static By securitycode=By.id("security_code");
	static By cardnumber=By.id("card_number");
	static By expirymonth=By.id("expiry_month");
	static By expiryyear=By.id("expiry_year");
	static By submit=By.id("submit_button");
	public static void products(){
		mouseOverOnEle(products);
	}
	public static void beverages(){
		click(beverages);
	}
	public static void chai(){
		click(chai);
	}
	public static void order(){
		click(order);
	}
	public static void editYourCart(){
		click(edityourcart);
	}
	public static void remove(){
		click(remove);
	}
	public static void next1(){
		click(next1);
	}
	public static void fname(String firstName){
		enterText(firstname, firstName);
	}
	public static void lname(String lastName){
		enterText(lastname, lastName);
	}
	public static void companyname(String companyName){
		enterText(companyname, companyName);
	}
	public static void streetaddress(String streetAddress){
		enterText(streetaddress, streetAddress);
	}
	public static void zipcode(String zipCode){
		enterText(zipcode, zipCode);
	}
	public static void areacode(String areaCode){
		enterText(areacode, areaCode);
	}
	public static void primaryphone(String primaryPhone){
		enterText(primaryphone, primaryPhone);
	}
	public static void shipbillingaddress(){
		click(shiptobillingaddress);
	}
	public static void next2(){
		click(next2);
	}
	
	public static void cardType(String text){
		handleDropDowbByText(cardtype, text);
	}
	public static void securitycode(String data){
		enterText(securitycode, data);
	}
	public static void cardnumber(String data){
		enterText(cardnumber, data);
	}
	public static void expirymonth(String text){
		handleDropDowbByText(expirymonth, text);
	}
	public static void expiryyear(String text){
		handleDropDowbByText(expiryyear, text);
	}
	public static void submit(){
		click(submit);
	}
	
	

}
