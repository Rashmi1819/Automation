package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods
{
	@Test(priority = 2)
	public void createcustomer() {
		Reporter.log("hi",true);
	}
	@Test
	public void modifycustomer() {
		Reporter.log("bye",true);
}
	@Test(priority = -3)
	public void deletecustomer() {
		Reporter.log("hicya",true);
}}