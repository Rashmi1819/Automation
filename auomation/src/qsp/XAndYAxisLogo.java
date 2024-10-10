package qsp;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XAndYAxisLogo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("login")).click();
		int x1 = driver.findElement(By.name("login")).getLocation().getX();		
		int y1 = driver.findElement(By.name("login")).getLocation().getY();
		System.out.println(x1);
		System.out.println(y1);
	driver.quit();
	}


}
