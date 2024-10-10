package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_Links {

	public static void main(String[] args) {
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    List<WebElement> Alllist = driver.findElements(By.tagName("a"));
    int count = Alllist.size();
    System.out.println(count);
    for (int i=0; i<count; i++) {
    	String links = Alllist.get(i).getText();
    	System.out.println(links);
    }
    }
	
	}


