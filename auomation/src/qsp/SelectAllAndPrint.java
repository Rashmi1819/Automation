package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllAndPrint {

	public static void main(String[] args) {
     WebDriver driver =new ChromeDriver();
     driver.get("file:///C:/Users/DELL/Desktop/MTR.html");
     WebElement find = driver.findElement(By.id("MTR"));
     Select s = new Select(find);
     List<WebElement> allopt = s.getOptions();
     int count = allopt.size();
     System.out.println(count);
     for(int i=0; i<count; i++) {
    	 s.selectByIndex(i);
    String printing = allopt.get(i).getText();
    System.out.println(printing);
     }
	}

}
