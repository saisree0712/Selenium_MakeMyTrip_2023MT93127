import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.Base;
import pageobjectsM.Buses;
import pageobjectsM.Cabs;
import pageobjectsM.Flights;
import pageobjectsM.Holidaypackages;
import pageobjectsM.Trains;

public class MMT_Travel extends Base {
WebDriver driver;

	@BeforeClass
	public void browser() throws IOException{
		
		loadDataProperties();
		driver = initializeBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		 File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src1, new File("files_ss//BrowseropenTravel.png"));
		
	}
	
	@AfterClass
	public void teardown(){
		
		driver.close();
		
	}

	
	@Test
	public void searchflights() throws InterruptedException, IOException {
		Flights flights = new Flights(driver);
		Trains trains = new Trains(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	flights.fromcity();
    	flights.fromcityinput(prop.getProperty("Flights_FromLocation"));
    	flights.departureCity();
    	flights.tocity();
    	flights.ArrivalCityinput(prop.getProperty("Flights_ToLocation"));
    	flights.arrivalCity();
    	flights.selectDate();
    	flights.travellers();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	flights.adultscounts();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	flights.applybutton();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	flights.searchbutton();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));;
    	flights.PopularFilters();
    	File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("files_ss//searchflights.png"));
    	flights.stops();
		
	}
	
	@Test
	public void searchtrains() throws IOException {
		Flights flights = new Flights(driver);
		Trains trains = new Trains(driver);
		trains.trains();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	flights.fromcity();
    	flights.fromcityinput(prop.getProperty("Fromstation"));
    	trains.Fromstation();
    //	flights.tocity();
    	flights.ArrivalCityinput(prop.getProperty("ToStation"));
    	trains.tostation();
    	flights.selectDate();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	trains.trainclass();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	flights.searchbutton();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	trains.Checkbox1stclassAC();
    	File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("files_ss//searchtrains.png"));
	}
	
	@Test
	public void searchbuses() throws IOException {
		Flights flights = new Flights(driver);
		Holidaypackages HP = new Holidaypackages(driver);
		Buses buses= new Buses(driver);
		buses.buses();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	flights.fromcity();
    	flights.fromcityinput(prop.getProperty("Holidaypackage_FromLocation"));
    	buses.StartCity();
    	flights.ArrivalCityinput(prop.getProperty("Flights_ToLocation"));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	buses.toCity();
    	flights.selectDate();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	HP.searchbutton();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	buses.ACbus();
    	buses.Sleeperbus();
    	File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("files_ss//searchbuses.png"));	
	}
	
	@Test
	public void searchcabs() throws IOException {
		Flights flights = new Flights(driver);
		Cabs cabs = new Cabs(driver);
		cabs.cabs();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	flights.fromcity();
    	flights.fromcityinput(prop.getProperty("Holidaypackage_FromLocation"));
    	cabs.StartCity();
    	flights.ArrivalCityinput(prop.getProperty("Flights_ToLocation"));
    	cabs.toCity();
    	cabs.departuredate();
    	flights.selectDate();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	flights.searchbutton();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("files_ss//searchcabs.png"));	
	}
	
	
}
