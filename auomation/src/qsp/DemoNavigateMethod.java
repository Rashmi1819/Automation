package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNavigateMethod {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");	
	Thread.sleep(2000);
	driver.navigate().back();	
	Thread.sleep(2000);
	driver.navigate().forward();Thread.sleep(2000);
	driver.navigate().refresh();Thread.sleep(2000);
	driver.close();
	
	}

}
