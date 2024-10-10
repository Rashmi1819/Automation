package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllMTRText {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/DELL/Desktop/MTR.html");
	WebElement allprint = driver.findElement(By.id("MTR"));
	Select s = new Select(allprint);
	List<WebElement> allopt= s.getOptions();
	Thread.sleep(2000);
	int count = allopt.size();
	System.out.println(count);
		for (int i=0; i<count; i++) {
			String text =allopt.get(i).getText();
			System.out.println(text);
	}
		driver.quit();
	}}

