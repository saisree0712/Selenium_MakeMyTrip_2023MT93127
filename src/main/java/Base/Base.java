package Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.HashSet;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	
	public Properties prop;
	
	public WebDriver initializeBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else if(browser.equalsIgnoreCase("ie")) {
			
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			
		}else if(browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		return driver;
		
	}
	
	
	public void loadDataProperties() {
		
		prop = new Properties();
		
		String projectPath = System.getProperty("user.dir");
		
		File file = new File(projectPath+"\\src\\main\\java\\resources\\TestData.properties");
		
		try {
		
		FileInputStream fis = new FileInputStream(file);
		
		prop.load(fis);
		
		}catch(Throwable t) {
			
			System.out.println(t.getMessage());
			
		}
						
	}
	
 public String getTimeStamp() {
		
		Date date = new Date();
		String timeStampModified = date.toString().replaceAll(" ","_").replaceAll(":","_");
		return timeStampModified;
		
	}
 
 public String TimeStampPhone() {
	 Date date = new Date();
	 String timeStampModified = 8+date.toString().replaceAll(" ","").replaceAll(":","");
	 return timeStampModified;
	    }
	   
 public void discription () {
	 Actions actions = new Actions(driver);
	 boolean description = driver.findElement(By.xpath("//input")).isSelected();
 	while(true!=description){
 		actions.sendKeys(Keys.TAB).perform();
 		
 	}
 }
			 
	 
 }
     

