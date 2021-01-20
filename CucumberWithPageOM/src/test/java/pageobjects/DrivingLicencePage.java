package pageobjects;

import org.cts.base.BasePage;
import org.openqa.selenium.By;

public class DrivingLicencePage extends BasePage {
	static By emailaddress=By.name("your-email");
	static By phonenumber=By.name("mobile");
	static By drivinglicence=By.xpath("//input[@value='Driving License']");
	static By applicantname=By.name("applicantname");
	static By relation=By.name("relation");
	static By accepttermsandorder=By.xpath("//input[@value='Accept Terms and Order']");
	
	
	public static void enterEmailAddress(String data){
		enterText(emailaddress, data);
	}
	public static void enterPhoneNumber(String data){
		enterText(phonenumber, data);
	}
	public static void selectDrivingLicence(){
		selectRadioButton(drivinglicence);
	}
	public static void enterApplicantName(String data){
		enterText(applicantname, data);
	}
	public static void selectRelation(String text){
		handleDropDowbByText(relation, text);
	}
	public static void clickOnAcceptTermsAndOrder(){
		click(accepttermsandorder);
	}
	
}
