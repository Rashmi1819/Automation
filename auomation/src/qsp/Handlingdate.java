package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingdate {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(4000);
driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(1000);
WebElement daylist = driver.findElement(By.id("day"));
Select s = new Select(daylist);
//s.selectByIndex(0);
s.selectByValue("1");
WebElement monthlist = driver.findElement(By.id("month"));
Select m = new Select(monthlist);
m.selectByVisibleText("Aug");


	}

}
