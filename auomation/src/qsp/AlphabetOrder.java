package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlphabetOrder {

	public static void main(String[] args) {
	TreeSet<String> ts = new TreeSet<String>(); 
	 WebDriver driver = new ChromeDriver();
	 driver.get("file:///C:/Users/DELL/Desktop/MTR.html");
	WebElement listbox = driver.findElement(By.id("MTR"));
	Select s = new Select(listbox);
	List<WebElement> allopt = s.getOptions();
	int count = allopt.size();
	System.out.println(count);
	for (int i=0; i<count; i++)
	{
		String text = allopt.get(i).getText();
		ts.add(text);
	}
for (String text : ts) {
	System.out.println(text);
}

	}	
}
