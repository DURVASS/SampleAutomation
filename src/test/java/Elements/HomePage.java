package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Sample.Automation.ReUsable;

public class HomePage extends ReUsable {
	public static final By HOME_POPUP_INTAKE=By.xpath("//*[contains(text(),'INTAKE')]");
	public static  WebElement getHomePageElement() {
		return getElement(HOME_POPUP_INTAKE);
	} 
}
