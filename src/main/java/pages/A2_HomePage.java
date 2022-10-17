package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class A2_HomePage extends ProjectSpecificMethods {
	
	public A2_HomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public A2_HomePage clickAppLauncher() {
		WebElement element = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
        return this;
	}
	
	public A2_HomePage clickViewAll() {
		
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
        return this;
	}
	
	public A2_HomePage enterSales() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Sales");
		Thread.sleep(2000);
		return this;

	}
	
	public A2_HomePage clickSales() throws InterruptedException {
		WebElement element1 =driver.findElement(By.xpath("(//p[@class='al-app-tile-description'])[3]"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);	
		Thread.sleep(2000);
        return this;
	}
	
	
	
	public A2_HomePage enterServiceConsole() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("service console");
		return this;
	}
	
	public A3_ServiceConsolePage clickServiceConsole() {
		driver.findElement(By.xpath("//mark[text()='Service Console']")).click();
		return new A3_ServiceConsolePage(driver);
		
	}
	
	
	

}
