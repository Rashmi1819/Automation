package qsp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutUsing_Quit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();Thread.sleep(2000);
		driver.get("https://secure.indeed.com/");Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='Continue with Apple']")).click();Thread.sleep(2000);
String parent = driver.getWindowHandle();
Thread.sleep(2000);
Set<String> allwin = driver.getWindowHandles();
for (String wh : allwin) {
	Thread.sleep(2000);
	driver.switchTo().window(wh);
	if (parent.equals(wh)) {
	}
    else {
    	driver.close();
	}
	
}
	
}
	}


