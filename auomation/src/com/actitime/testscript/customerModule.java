package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class customerModule extends BaseClass{

 @Test
public void CreateCustomer() {
	Reporter.log("createCustomer",true);
}
@Test
public void DeleteCustomer() {
	Reporter.log("DeleteCustomer",true);
}
@Test
public void EditCustomer() {
	Reporter.log("EditCustomer",true);
}
}
