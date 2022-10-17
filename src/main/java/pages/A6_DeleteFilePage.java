package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ProjectSpecificMethods;

public class A6_DeleteFilePage extends ProjectSpecificMethods{
	
	public A6_DeleteFilePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public A6_DeleteFilePage clickDeleteButton() {
//		WebElement element3=driver.findElement(By.xpath("(//a[@title='Delete'])[6]"));
//		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
//		executor3.executeScript("arguments[0].click();", element3);
		driver.findElement(By.xpath("//div[@class='branding-actions actionMenu popupTargetContainer uiPopupTarget uiMenuList forceActionsDropDownMenuList uiMenuList--left uiMenuList--default visible positioned']//li[7]/a")).click();
	return this;
	}
	
	public A6_DeleteFilePage confirmDelete() {
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
    return this;
	}
	
	public A6_DeleteFilePage verifyDeletedDocument() {
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'toast')]")));
			String toastText = driver.findElement(By.xpath("//span[contains(@class,'toast')]")).getText();
			System.out.println("Toast message is : " + toastText);
//Expexted Result:
//The Compaign should be edited successfully.
			if(toastText.contains("Assessment_vidhya"))
			{
				System.out.println("deleted successfully");
			}
			else {
				System.out.println("Not deleted successfully");
			}
			return this;
		

	}

}
