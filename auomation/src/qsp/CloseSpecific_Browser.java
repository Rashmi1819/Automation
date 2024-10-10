package qsp;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecific_Browser {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		System.out.println("enter the needed url");
		String title = sc.nextLine();
		System.out.println(title);
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allopt = driver.getWindowHandles();
		for (String al : allopt) {
			driver.switchTo().window(al);
			String atitle = driver.getTitle();
			System.out.println(al);
			if (atitle.contains(title)) {
		}
			else {
				driver.close();
		}
		}}}


