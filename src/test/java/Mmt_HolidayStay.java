import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.Base;
import pageobjectsM.Holidaypackages;
import pageobjectsM.Hotels;

public class Mmt_HolidayStay extends Base {
WebDriver driver;
	
	@BeforeClass
	public void browser() throws IOException{
		
		loadDataProperties();
		driver = initializeBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		 File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src1, new File("files_ss//BrowseropenHolidaystay.png"));
		
	}
	
	@AfterClass
	public void teardown(){
		
		driver.close();
		
	}

	
	@Test
	public void searchForHolidaypacakages() throws IOException {
		
		Holidaypackages HP = new Holidaypackages(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	HP.holiday();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	HP.fromcity();
    	HP.fromcityinput(prop.getProperty("Holidaypackage_FromLocation"));
    	HP.departureCity();
    	HP.tocity();
    	HP.ArrivalCityinput(prop.getProperty("Holidaypackage_ToLocation"));
    	HP.arrivalCity();
    	HP.selectDate();
    	HP.applybutton();
    	HP.applybutton();
    	HP.searchbutton();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));;
    	HP.allPackages();
    	File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("files_ss//searchForHolidaypacakages.png"));
		
	}
	
	@Test
public void searchForHotels() throws IOException, InterruptedException {
		
		Hotels Hotels = new Hotels(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Hotels.hotels();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	Hotels.city();
    	Hotels.cityinput(prop.getProperty("Flights_FromLocation"));
    	Hotels.stayingCity();
    	Hotels.SelectcheckindatetDate();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	Hotels.Selectcheckoutdate();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	Hotels.applybutton();
    	Thread.sleep(5000);
    	Hotels.searchbutton();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));;
    	Hotels.Properties();
    	File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("files_ss//searchForHotels.png"));
		
	}
	
	
	
	
   
}
