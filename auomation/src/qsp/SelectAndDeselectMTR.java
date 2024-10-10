package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselectMTR {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/MTR.html");
		WebElement find = driver.findElement(By.id("SLV"));
		Select s = new Select(find);
		List<WebElement> allopt = s.getOptions();
		System.out.println(allopt);
		int count = allopt.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++) {
			Thread.sleep(2000);
			s.selectByIndex(i);
		}
		for(int j=0; j<count; j++) {
			Thread.sleep(2000);
			s.deselectByIndex(j);
	}

}}