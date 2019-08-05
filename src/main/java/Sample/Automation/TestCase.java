package Sample.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.google.co.in");
		String s=driver.getCurrentUrl();
		System.out.println("The Current URL is"+s);
	}

}
