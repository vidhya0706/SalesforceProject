package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class ProjectSpecificMethods {
	
	public  RemoteWebDriver driver;
	//public static ChromDriver driver;
	public String excelfilename;
	public static Properties prop_lang;
	
	   // @Parameters({"url"})
	    
	    @BeforeMethod
	    public void preCondition() throws IOException {
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get(url);
	    Properties prop= new Properties();
		FileInputStream file= new FileInputStream(new File("./src/main/resources/AppConfig.properties"));
		
		prop.load(file);
		String url= prop.getProperty("appURL");
		String browsername= prop.getProperty("browser");
		String language =prop.getProperty("language");
		
	    prop_lang= new Properties();
		FileInputStream file1= new FileInputStream(new File("./src/main/resources/"+language+".properties"));
		prop_lang.load(file1);
		
		
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option =new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver =new ChromeDriver(option);
			
		     }
		else if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions option =new EdgeOptions();
			option.addArguments("--disable-notifications");
			driver = new EdgeDriver(option);
		     }
		
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    }
	    
	    @AfterMethod
	    public void postCondition() {
			driver.close();

		}
	    
	    @DataProvider
		public String[][] sendData() throws IOException
		{
			ReadExcel rd = new ReadExcel();
			String[][] exceldata=rd.excelData(excelfilename);
			
			return exceldata;
		}
		

}
