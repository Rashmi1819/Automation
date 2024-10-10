package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_quit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");Thread.sleep(2000);
		driver.findElement(By.id("login-google-button")).click();Thread.sleep(2000);
		driver.findElement(By.id("apple-signin-button")).click();Thread.sleep(2000);
		String parent = driver.getWindowHandle();Thread.sleep(2000);
		Set<String> allwin = driver.getWindowHandles();Thread.sleep(2000);
		for (String wh: allwin) {
		   driver.switchTo().window(wh);Thread.sleep(2000);
		   if (parent.equals(wh)) {
			
		} else {
driver.close();
Thread.sleep(2000);
		}			
		}
		

	}

}
