package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	List<WebElement> amazon = driver.findElements(By.xpath("//a"));
	int count = amazon.size();
	for(int i=0; i<count; i++)
	{
	String text = amazon.get(i).getText();
			System.out.println(text);
driver.quit();
	}

	}}
