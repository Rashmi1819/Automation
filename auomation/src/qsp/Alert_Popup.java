package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
        Thread.sleep(2000);
        try {
        	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
            Thread.sleep(2000);
        	System.out.println("enableing");
            Alert a = driver.switchTo().alert();
			a.accept();
		} catch (Exception e) {
			System.out.println("not disable");
		}
driver.quit();
	}

}
