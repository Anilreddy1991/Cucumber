package pageobjects;

import org.cts.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	static By username=By.id("user_name");
	static By password=By.id("user_pass");
	static By signin=By.id("login_button");

	
public static void enterUsername(String data){
	enterText(username, data);
}
public static void enterPassword(String data){
	enterText(password, data);
}
public static void signIn(){
	click(signin);
}

}
