package com.actitime.generic;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
@BeforeClass
	public void openBrowser() {
		Reporter.log("OpenBroswer",true);
	}
@AfterClass
		public void CloseBrowser() {
			Reporter.log("OpenBroswer",true);
		}
@BeforeMethod
public void Login() {
	Reporter.log("Login",true);
}
@AfterMethod
public void Logout() {
	Reporter.log("Logout",true);	

}
	}


