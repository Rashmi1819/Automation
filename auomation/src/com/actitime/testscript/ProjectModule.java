package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test
	public void CreateCustomer() {
		Reporter.log("createCustomer",true);
	}
	@Test
	public void DeleteCustomer() {
		Reporter.log("DeleteCustomer",true);
	}
	@Test
	public void TaskCustomer() {
		Reporter.log("TaskCustomer",true);
	}
	}



