package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown1 {

			public static void main(String[] args) throws InterruptedException {
		
				WebDriver driver =new ChromeDriver();
				driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
				driver.findElement(By.linkText("Sign up for Facebook")).click();Thread.sleep(2000);
				Thread.sleep(2000) ;
				WebElement daylist = driver.findElement(By.id("day"));
				Thread.sleep(2000);
				Select s =new Select(daylist);
						s.selectByIndex(3);
				
			}


	}

