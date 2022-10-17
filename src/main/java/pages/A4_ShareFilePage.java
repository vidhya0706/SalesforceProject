package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class A4_ShareFilePage  extends ProjectSpecificMethods{
	
	public A4_ShareFilePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public A4_ShareFilePage clickTextField() {
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
		return this;

	}
	
	public A4_ShareFilePage selectName() {
		driver.findElement(By.xpath("//div[@title='Derrick Dsouza']")).click();
		return this;

	}
	
	public A4_ShareFilePage verifyErrorMessage() {
		String text=driver.findElement(By.xpath("//li[@class='form-element__help']")).getText();
		
		if(text.contains("Can't share")) {
			System.out.println("Verified");}
			else {
				System.out.println("not verified");
			}
		return this;
		}
	
	public A4_ShareFilePage closeWindow1() {
		driver.findElement(By.xpath("//button[@title='Close this window']/lightning-icon")).click();
		return this;

	}
	
	public A4_ShareFilePage closeFile() throws InterruptedException {
		driver.findElement(By.xpath("//button[@title='Close']")).click();
		Thread.sleep(2000);
		return this;
	}

	}
	

