package pageobjectsM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hotels {
	WebDriver driver;
	public Hotels(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//li[@class='menu_Hotels']//a")
	WebElement Hotels;
	
	@FindBy(css="label[for='city']")
	WebElement city;
	
	
	@FindBy(css="input[placeholder='Where do you want to stay?']")
	WebElement cityinput;
	
	@FindBy(xpath="//span[text()='Bangalore']/parent::p[@class='sr_city']")
	WebElement stayingCity;
	
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement Applybutton;
	
	@FindBy(xpath="//button[@id='hsw_search_button']")
	WebElement searchbutton;
	
	@FindBy(xpath="//p[text()='Showing Properties in Bangalore']")
	WebElement Properties;
	
	@FindBy(xpath="//div[@class='DayPicker-Day' and @aria-label='Tue Apr 08 2025']")
	WebElement Selectcheckindate;
	
	@FindBy(xpath="//div[@class='DayPicker-Day' and @aria-label='Thu Apr 10 2025']")
	WebElement Selectcheckoutdate;
	
	
	@FindBy(xpath="//div[text()='Price per night']")
	WebElement priceofhotel;
	
	public void priceofhotel() {
		Actions a = new Actions(driver);
		a.scrollToElement(priceofhotel);
	}
	public void Selectcheckoutdate() {
		Selectcheckoutdate.click();
	}
	
	
	public  void Properties() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Showing Properties in Bangalore']")));
		
		}
	
	public  void searchbutton() {
	//	wait.until(ExpectedConditions.visibilityOf(searchbutton));
		searchbutton.click();
		}
	
	public  void applybutton() {
	//	wait.until(ExpectedConditions.visibilityOf(Applybutton));
		Applybutton.click();
		}
	
	public  void hotels() {
		Hotels.click();
		}
	
	public  void city() {
		city.click();
		}
	
	
	
	public  void cityinput(String Fromcity) {
	//	wait.until(ExpectedConditions.visibilityOf(Fromcityinput));
		cityinput.clear();
		cityinput.sendKeys(Fromcity);
		}
	
	
	
	public  void stayingCity() {
	//	wait.until(ExpectedConditions.visibilityOf(DepartureCity));
		stayingCity.click();
		
		}
	
	
		
	public void SelectcheckindatetDate() {
		Selectcheckindate.click();
		 

		
	}	
	
}
