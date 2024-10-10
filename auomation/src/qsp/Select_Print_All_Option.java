package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Print_All_Option {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/MTR.html");
		WebElement print = driver.findElement(By.id("MTR"));
		Select s = new Select(print);
		List<WebElement> allopt = s.getOptions();Thread.sleep(1000);
	int count = allopt.size();
	for(int i=0; i<count; i++)
		{
		String strinttext = allopt.get(i).getText();
		System.out.println(strinttext);
		}
		driver.quit();
	}

}