package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlNavigation {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.selenium.org/");
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.selenium.dev/"))
			System.out.println("url is navigation and pass");
		
	}

		}
	
