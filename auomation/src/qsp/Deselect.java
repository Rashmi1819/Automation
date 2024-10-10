package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class Deselect {
 
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/DELL/Desktop/MTR.html");
	WebElement link = driver.findElement(By.id("MTR"));
	Select s = new Select(link);
List<WebElement> allopt = s.getOptions();
int count = allopt.size();

	for(int i=0; i<count; i++)
	{
	s.selectByIndex(i);
	
	}
	for(int j=0; j<count; j++)
	{
	s.deselectByIndex(j);
	
	}

	}

}
