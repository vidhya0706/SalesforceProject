package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.A1_LoginPage;

public class A_DownloadFile extends ProjectSpecificMethods {
	
	@Test
	public void runDownloadFile() throws InterruptedException {
		
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
		.clickModifiedDate()
		.clickLatestModifiedLink()
		.clickPublicLink()
		.clickCreateLink()
		.clickCreateNewLink()
		.verifyLink()
		.closeWindow()
		.downloadFile();

	}


}
