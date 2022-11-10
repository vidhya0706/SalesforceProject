package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Opportunity extends BaseClass {
	
	//public ChromeDriver driver;

//	@Given("open the chromebrowser")
//	public void openBrowser() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions option =new ChromeOptions();
//		option.addArguments("--disable-notifications");
//		
//	    driver =new ChromeDriver(option);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	}
//	
//	@Given("Load the application {string}")
//    public void LoadUrl(String url) {
//    	driver.get(url);
//		driver.manage().window().maximize();
//		
//	}
//
//	@Given("enter the username {string}")
//    public void EnterUsername(String username) {
//    	driver.findElement(By.id("username")).sendKeys(username);
//	
//    }
//
//
//	@Given("enter the password {string}")
//    public void EnterPassword(String password) {
//    	driver.findElement(By.id("password")).sendKeys(password);
//	
//    }

//	@When("click on submit button")
//    public void ClickSubmit() {
//    	driver.findElement(By.xpath("//input[@type='submit']")).click();
//	
//    }
//
//	@Then("Home page should be displayed")
//    public void OpenBrowser() {
//    	System.out.println("browser is opened");
//	
//    }
//	
	@Given("Click on toggle menu button from the left corner")
	public void ClickToggleMenu() {
		WebElement element = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		}
	
	@Given("Click view All")
	public void ClickViewAll() {
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
	}
	
	@Given("click Sales from App Launcher")
	public void ClickSales() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Sales");
		
		WebElement element1 =driver.findElement(By.xpath("(//p[@class='al-app-tile-description'])[3]"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);	
		Thread.sleep(2000);
		
	}
	
	@Given("Click on Opportunity tab")
	public void ClickOpportunity() {
		WebElement element2=driver.findElement(By.xpath("//span[text()='Opportunities']"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", element2);
	}
	
	@Given("Click on New button")
	public void ClickNewButton() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}
	
	@Given("Enter Opportunity name")
	public void EnterOpportunityName() {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Srividhya");
	}
	
	@Given("Choose close date as Today")
	public void ChooseDate() {
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		WebElement element3=driver.findElement(By.xpath("//button[@name='today']"));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();", element3);
	}
	
	@Given("Select Stage")
	public void SelectStage() {
		driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
		driver.findElement(By.xpath("(//span[@class='slds-media__body'])[4]")).click();
	}
	
	@When("click Save")
    public void ClickSave() throws InterruptedException {

		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	    Thread.sleep(2000);
    }
	
	@Then("VerifyOpportunity Name")
	public void VerifyOpportunityName() {
		  String OppName= driver.findElement(By.xpath("//div[text()='Opportunity']//following-sibling::slot//lightning-formatted-text")).getText();
		  System.out.println(OppName);
		  
		  
		  if(OppName.contains("Salesforce Automation by Srividhya"))
		  {
			System.out.println("Opportunity is created");  
		  }
		  else {
			  System.out.println("Opportunity is not created");
		  }
	}
	
	
	@Given("Search the Opportunity by name")
	public void SelectOpportunityByName() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Salesforce Automation by Srividhya"+Keys.ENTER);
		Thread.sleep(2000);
	}
	
	@Given("Click on the Dropdown icon")
	public void ClickDropDownIcon() throws InterruptedException {
		WebElement element3 = driver.findElement(By.xpath("//tbody/tr[1]/td[8]//a"));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();", element3);
	}
	
	@Given("Select Edit")
	public void ClickEditOpportunity() throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
	}
	
	
	@Given("Choose close date as Tomorrow date")
	public void ChooseDateAsTomorrow() throws InterruptedException {

		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		WebElement element4=driver.findElement(By.xpath("//button[@class='slds-button slds-align_absolute-center slds-text-link']"));
		JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();", element4);
		
	}
	
	@Given("Select Stage as Perception Analysis")
	public void SelectStageAsPerception() throws InterruptedException {
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='slds-media__body'])[7]")).click();
	}
	
	@Given("Select Deliver Status as In Progress")
	public void SelectDeliverStatus() throws InterruptedException {
		WebElement element6=driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[4]"));
		JavascriptExecutor executor6 = (JavascriptExecutor)driver;
		executor6.executeScript("arguments[0].click();", element6);
		driver.findElement(By.xpath("//span[text()='In progress']")).click();
	}
	
	@Given("Enter Description as SalesForce")
	public void EnterDescription() throws InterruptedException {
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Salesforce");
	}
	
	@When("Click on Save")
	public void ClickOnSave() throws InterruptedException {
		WebElement element5=driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		JavascriptExecutor executor5 = (JavascriptExecutor)driver;
		executor5.executeScript("arguments[0].click();", element5);
	}
	
	@Then("Verify edited opportunity")
	public void VerifyEditedOpportunity() throws InterruptedException {
		String OppName= driver.findElement(By.xpath("//span[text()='Perception Analysis']")).getText();
		System.out.println(OppName);
		if(OppName.contains("Perception Analysis"))
		  {
			System.out.println("Opportunity is Edited");  
		  }
		  else {
			  System.out.println("Opportunity is not edited");
		  }
	}
	
	
	
	
	
	

  
	

}
