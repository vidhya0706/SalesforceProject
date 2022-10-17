package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.A1_LoginPage;

public class D_DeleteFile extends ProjectSpecificMethods {
	
	
	@Test
	public void runDeleteFile() throws InterruptedException {
		
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
		.clickArrowButton1()
		.clickDeleteButton()
		.confirmDelete()
		.verifyDeletedDocument();

}
}
