package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods2
{
	@Test(enabled=false)
	public void createcustomer() {
		Reporter.log("hi",true);
	}
	@Test
	public void modifycustomer() {
		Reporter.log("bye",false);
}
	@Test
	public void deletecustomer() {
		Reporter.log("hicya",true);
}}