package Sample.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

public class ReUsable {
	public static WebDriver driver =new FirefoxDriver();
 public static void clickElement(WebElement el) {
	 el.click();
 }
 public static WebElement getElement(By element) {
	 WebElement lookUp=null;
	 try {
		 lookUp=driver.findElement(element);
	 }catch(Exception e) {
		 System.out.println("not find element"+e.getMessage());
	 }
	 return lookUp;
 }
 public static boolean veripfyElementDisplayStatus(By element) {
	 WebElement lookUp=driver.findElement(element);
	 boolean elementStatus=false;
	 try {
		 if(lookUp.isDisplayed()) {
			 elementStatus=true;
		 }else {
			 elementStatus=false;
		 }
	 }catch (Exception e) {
		e.printStackTrace();
	}
	 return elementStatus;
 }
 public static String getElementText(By el) {
	 String eleText=null;
	 try {
		 eleText=driver.findElement(el).getText();
	 }catch(Exception e) {
		 System.out.println("element not found");
	 }
	 return eleText;
 }
 public static void getImpWait() {
	 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
 }
 public static void exWait(By el) {
	 WebDriverWait wait=new WebDriverWait(driver, 3000);
	 wait.until(ExpectedConditions.visibilityOf(driver.findElement(el)));
 }
 
}