package Sample.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		Thread.sleep(5000);
		driver.quit();
	}
}
