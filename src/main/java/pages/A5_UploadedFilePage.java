package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class A5_UploadedFilePage extends ProjectSpecificMethods{
	
	public A5_UploadedFilePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	 
	public A5_UploadedFilePage submitFile() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		Thread.sleep(2000);
		return this;
	}
	
	 
	 
	public A5_UploadedFilePage clickModifiedDate1() throws InterruptedException {
		driver.findElement(By.xpath("//span[@title='Last Modified Date']")).click();
		Thread.sleep(2000);
		return this;
	}
	
public A5_UploadedFilePage clickArrowButton() {
	driver.findElement(By.xpath("//table/tbody/tr/td[4]//a")).click();
	return this;
}

public A5_UploadedFilePage clickViewDetails() {
	driver.findElement(By.xpath("//a[@title='View File Details']")).click();
	return this;
}

public A5_UploadedFilePage verifyUploadedFile() {
	String text = driver.findElement(By.xpath("//div[text()='File']/following::div")).getText();
	if(text.contains("Assessment_vidhya"))
	{
		System.out.println("verified the file");
	}
	else {
		System.out.println("Not verified the file");
	}
	return this;
	
	
}
  
public A5_UploadedFilePage closeFileWindow() {
	driver.findElement(By.xpath("//button[@title='Close Assessment_vidhya']")).click();
	return this;

}



}
