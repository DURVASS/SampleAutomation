package Sample.Automation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase {

	public static void main(String[] args) {
		/*WebDriver driver =new FirefoxDriver();
		driver.get("http://www.google.co.in");
		String s=driver.getCurrentUrl();
		System.out.println("The Current URL is"+s);*/
	
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	int l=0;
	for(int x=2;x<=i;x++) {
		int z=i%x;
		if(z==0) {
			System.out.println(x);
			l++;
		}else {
			
		}
	}
	
	if(l>1) {
		System.out.println("not prime"+l);
	}else {
		System.out.println("prime"+l);
	}
	}
}
