package com.actitime.testscript;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCrossBrowser {
public static WebDriver driver;
	public static void main(String[] args) {
	try (Scanner s = new Scanner(System.in)) {
		System.out.println("Enter the Browser name");
			String browser = s.nextLine();
			{
			switch (browser) {
			case "chrome": driver = new ChromeDriver(); break;
			default: driver = new ChromeDriver(); break;		
			}
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		}
	}
	
	}
}
