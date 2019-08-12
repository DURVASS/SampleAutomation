package Sample.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import Elements.HomePage;

public class Sel extends HomePage{
	

	public static void main(String[] args){
		driver.get("http://www.rgmcet.edu.in");
		/* clickElement(getHomePageElement()); */
		 exWait(HOME_POPUP_INTAKE); 
		if(veripfyElementDisplayStatus(HOME_POPUP_INTAKE)) {
			System.out.println("Element found with this name"+getElementText(HOME_POPUP_INTAKE));
		}else {
			Assert.fail("The "+HOME_POPUP_INTAKE+" is not displayed");
		}
	}
}
