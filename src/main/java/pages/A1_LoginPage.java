package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class A1_LoginPage extends ProjectSpecificMethods {
	
	public A1_LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}

	
	public A1_LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		return this;
	}
    
	public A1_LoginPage enterPasssword() {
		driver.findElement(By.id("password")).sendKeys("India$321");
        return this;
	}
	
    public A2_HomePage clickLogin() {
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
        return new A2_HomePage(driver);
	}

}
