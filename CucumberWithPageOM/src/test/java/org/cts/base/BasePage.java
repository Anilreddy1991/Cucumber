package org.cts.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {
	public static File configfile;
    public static FileInputStream configfis;
    public static Properties configprop;
    public static File log4jfile;
    public static FileInputStream log4jfis;
    public static WebDriver driver;
    public static Logger logger=Logger.getLogger(BasePage.class);
    
    public static void loadLog4jProperties(){
    	log4jfile=new File("../CucumberWithPageOM/src/test/java/org/cts/resources/Log4j.properties");
    	logger.info("Log4j Property File Loaded");
    	try {
			log4jfis=new FileInputStream(log4jfile);
			PropertyConfigurator.configure(log4jfis);
		} catch (FileNotFoundException e) {	
			logger.error("Log4j Property File Not Loaded"+e.getMessage());
			e.printStackTrace();
		}
    	  }
public static void loadConfigProperties(){
	configfile=new File("../CucumberWithPageOM/src/test/java/org/cts/resources/Config.properties");
	logger.info("Config Property File Loaded");
	try {
		configfis=new FileInputStream(configfile);
		configprop=new Properties();
		configprop.load(configfis);
	} catch (FileNotFoundException e) {
		logger.error("Config Property File Not Loaded"+e.getMessage());
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
}

public static void invokeBrowser(){
	loadConfigProperties();
	loadLog4jProperties();
	String browser=configprop.getProperty("Browser");
	logger.info("Browser::"+browser);
	if(browser.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver", "../CucumberFwkWithPOM/Browsers/chromedriver.exe");
		driver=new ChromeDriver();
		logger.info("Chrome Browser Invoked");
	}else if(browser.equalsIgnoreCase("Firefox")){
		System.setProperty("webdriver.gecko.driver", "../CucumberWithPageOM/Browsers/geckodriver.exe");
		driver=new FirefoxDriver();
		logger.info("Firefox Browser Invoked");
	}else if(browser.equalsIgnoreCase("IE")){
		System.setProperty("webdriver.InternetExplorer.driver", "../CucumberWithPageOM/Browsers/IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		logger.info("IE Browser Invoked");
	}else{
		logger.error("Browser not Invoked");
		driver.manage().window().maximize();
		
	}
}
public static void launchUrl(){
	loadConfigProperties();
	loadLog4jProperties();
	String url=configprop.getProperty("baseUrl");
	logger.info("baseUrl::"+url);
	driver.get(url);
}
public static void highLightElement(WebElement ele){
	 JavascriptExecutor jse = (JavascriptExecutor) driver;
     jse.executeScript("arguments[0].style.border='3px solid red'", ele);
 }

public static void waitForElement(WebElement ele){
	WebDriverWait wait=new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOf(ele));
}
public static void waitForEleClickable(WebElement ele){
	WebDriverWait wait=new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
}
public static void performMouseOverOnEle(WebElement ele){
	WebDriverWait wait=new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
}
public static void performDropDownOnEle(WebElement ele){
	WebDriverWait wait=new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOf(ele));
}
public static void performRadioButton(WebElement ele){
	WebDriverWait wait=new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
}
public static void performCheckbox(WebElement ele){
	WebDriverWait wait=new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
}


public static void enterText(By by,String data){
	WebElement ele=driver.findElement(by);
	waitForElement( ele);
	highLightElement( ele);
	if(ele.isDisplayed()){
		ele.sendKeys(data);
	logger.info("enter data in input field");
	}else{
		logger.error("unable to enter data in input field");
	}
}
public static void click(By by){
	
	WebElement ele=driver.findElement(by);
	waitForEleClickable(ele);
	highLightElement( ele);
	if(ele.isEnabled()){
		ele.click();
		logger.info("clicked on webelement");
	}else{
		logger.error("unable to clicked on webelement");
	}
}
public static void mouseOverOnEle(By by){
	WebElement ele=driver.findElement(by);
	performMouseOverOnEle(ele);
	highLightElement( ele);
	if(ele.isEnabled()){
	Actions action=new Actions(driver);
	action.moveToElement(ele).build().perform();
	logger.info("mouseover performed on webelement");
	}else{
		logger.error("unable to mouseover performed on webelement");
	}
}
public static void handleDropDowbByText(By by,String text){
	WebElement ele=driver.findElement(by);
	performDropDownOnEle(ele);
	highLightElement( ele);
	if(ele.isDisplayed()){
	Select select=new Select(ele);
	select.selectByVisibleText(text);
	logger.info("selected option from dropdown");
	}else{
		logger.error("unable to selected option from dropdown ");
	}
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void handleDropDowbByValue(By by,String value){
	WebElement ele=driver.findElement(by);
	performDropDownOnEle(ele);
	highLightElement( ele);
	Select select=new Select(ele);
	select.selectByValue(value);
}
public static void handleDropDowbByIndex(By by,int index){
	WebElement ele=driver.findElement(by);
	performDropDownOnEle(ele);
	highLightElement( ele);
	Select select=new Select(ele);
	select.selectByIndex(index);
}
public static void selectRadioButton(By by){
	WebElement ele=driver.findElement(by);
	performRadioButton(ele);
	highLightElement( ele);
	if(ele.isDisplayed() && ele.isEnabled()){
		ele.click();
		logger.info("selected radio button");
	}else{
		logger.error("unable to select radio button");
	}
}
public static void selectCheckbox(By by){
	WebElement ele=driver.findElement(by);
	performCheckbox(ele);
	highLightElement( ele);
	if(ele.isDisplayed() && ele.isEnabled()){
		ele.click();
		logger.info("selected checkbox element");
	}else{
		logger.error("unable to select checkbox element");
	}
}
	
}
		
	


