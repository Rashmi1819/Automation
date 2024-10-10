package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandilingAllOptioninMTR {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/MTR.html");
		 WebElement mtr = driver.findElement(By.id("MTR"));
		Select s =new Select(mtr);
List<WebElement> alloptions = s.getOptions();
int count = alloptions.size();
System.out.println(count);
for(int i=0; i<count; i++) {
String print = alloptions.get(i).getText();
System.out.println(print);Thread.sleep(2000);
}
	driver.quit();
}
	

}
