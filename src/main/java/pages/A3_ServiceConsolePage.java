package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class A3_ServiceConsolePage extends ProjectSpecificMethods{
	
	public A3_ServiceConsolePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public A3_ServiceConsolePage clickDropDown() {
		driver.findElement(By.xpath("//button[@title='Show Navigation Menu']")).click();
        return this;
	}
	
	public A3_ServiceConsolePage clickFiles() throws InterruptedException {
		driver.findElement(By.xpath("(//span[text()='Files'])[2]")).click();
		Thread.sleep(2000);
		return this;
	}
	
	public A3_ServiceConsolePage clickModifiedDate() throws InterruptedException {
		driver.findElement(By.xpath("//span[@title='Last Modified Date']")).click();
		Thread.sleep(2000);
		return this;
		
	}
	
	public A3_ServiceConsolePage clickLatestModifiedLink() throws InterruptedException {
		driver.findElement(By.xpath("(//table/tbody/tr/th)[1]//a")).click();
		Thread.sleep(2000);
		return this;
		

	}
	public A3_ServiceConsolePage clickPublicLink() {
		driver.findElement(By.xpath("//span[text()='Public Link']")).click();
       return this;
	}
	public A3_ServiceConsolePage clickCreateLink() {
		driver.findElement(By.xpath("//button[@title='Create Link']")).click();
        return this;
	}
	
	public A3_ServiceConsolePage clickCreateNewLink() {
		driver.findElement(By.xpath("//span[text()='Create']")).click();
     return this;
	}
	
	public A3_ServiceConsolePage verifyLink() {
		Boolean  s = driver.findElement(By.xpath("//input[@class='slds-input']")).isEnabled();
		if(s.equals(false)) {
			System.out.println("disabled");
		}
		else {
			System.out.println("Enabled");
		}
        return this;
	}
	
	public A3_ServiceConsolePage closeWindow() throws InterruptedException {
		driver.findElement(By.xpath("//button[@title='Close this window']/lightning-primitive-icon")).click();
		Thread.sleep(2000);
		return this;	

	}
	
	public A3_ServiceConsolePage downloadFile() {
		driver.findElement(By.xpath("//span[text()='Download']")).click();
     return this;
	}
	
	public A5_UploadedFilePage clickUploadButton() throws InterruptedException, AWTException {
		//driver.findElement(By.xpath("//li[@class='slds-button slds-button--neutral']/a")).click();
		 WebElement browse = driver.findElement(By.xpath("//li[@class='slds-button slds-button--neutral']/a"));
         browse.click();

		   //click on ‘Choose file’ to upload the desired file
		  // browse.sendKeys("C:\\Users\\govin\\Desktop\\Assessment_vidhya.txt"); //Uploading the file using sendKeys
	// file path passed as parameter to StringSelection
		      StringSelection ss = new StringSelection("C:\\Users\\govin\\Desktop\\Assessment_vidhya1");
		      // Clipboard copy
		      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		      // Robot object creation
		      Robot r = new Robot();
		      r.keyPress(KeyEvent.VK_CONTROL);
		      r.keyPress(KeyEvent.VK_V);
		      //releasing ctrl+v
		      r.keyRelease(KeyEvent.VK_CONTROL);
		      r.keyRelease(KeyEvent.VK_V);
		      //pressing enter
		      r.keyPress(KeyEvent.VK_ENTER);
		      //releasing enter
		      r.keyRelease(KeyEvent.VK_ENTER);
		      r.delay(5000);
		      Thread.sleep(5000);
		     
		return new A5_UploadedFilePage(driver);

	}
	
	public A4_ShareFilePage shareFile() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Share']")).click();
		Thread.sleep(2000);
		return new A4_ShareFilePage(driver);
		
	}
	public A6_DeleteFilePage clickArrowButton1() {
		driver.findElement(By.xpath("//tbody/tr/td[4]//a")).click();
		return new A6_DeleteFilePage(driver);
	}
}
