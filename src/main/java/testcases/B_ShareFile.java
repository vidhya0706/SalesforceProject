package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.A1_LoginPage;

public class B_ShareFile extends ProjectSpecificMethods {
	
	@Test
	public void runShareFile() throws InterruptedException {
		
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
		.clickLatestModifiedLink()
		.shareFile()
		.clickTextField()
		.selectName()
		.verifyErrorMessage()
		.closeWindow1()
		.closeFile();
		
		

	}


}
