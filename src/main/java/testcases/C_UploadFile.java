package testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.A1_LoginPage;


public class C_UploadFile extends ProjectSpecificMethods{
	
	@Test(retryAnalyzer =RetryFailedTests.class)
	public void runUploadFile() throws InterruptedException, AWTException {
		
		new A1_LoginPage(driver)
		.enterUsername()
		.enterPasssword()
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.enterServiceConsole()
		.clickServiceConsole()
		.clickDropDown()
		.clickFiles()
		.clickUploadButton()
		.submitFile()
		.clickModifiedDate1()
		.clickArrowButton()
		.clickViewDetails()
		.verifyUploadedFile()
	.closeFileWindow();
		
}
}
