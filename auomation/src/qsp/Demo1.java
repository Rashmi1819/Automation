package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();
	
}

}
