package pageobjectsM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Base;

public class Holidaypackages extends Base{
	
	WebDriver driver;
	public Holidaypackages(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//li[@class='menu_Holidays removeItemMargin']//a")
	WebElement Holiday;
	
	@FindBy(css="label[class='lbl_input makeFlex column latoBold']")
	WebElement Fromcity;
	
	@FindBy(css="label[for='toCity']")
	WebElement Tocity;
	
	@FindBy(css="input[placeholder='Enter City']")
	WebElement Fromcityinput;
	
	@FindBy(xpath="//li[text()='Bangalore']")
	WebElement DepartureCity;
	
	@FindBy(xpath="//input[@placeholder='To']")
	WebElement ArrivalCityinput;
	
	@FindBy(xpath="//div[text()='Goa']/parent::div")
	WebElement ArrivalCity;
	
	@FindBy(xpath="//button[text()='APPLY']")
	WebElement Applybutton;
	
	@FindBy(xpath="//button[@id='search_button']")
	WebElement searchbutton;
	
	@FindBy(xpath="//span[text()='All Packages']")
	WebElement allPackages;
	
	@FindBy(xpath="//div[@class='DayPicker-Day' and @aria-label='Tue Apr 08 2025']")
	WebElement Selectdate;
	
	public  void allPackages() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='All Packages']")));
		
		}
	
	public  void searchbutton() {
	//	wait.until(ExpectedConditions.visibilityOf(searchbutton));
		searchbutton.click();
		}
	
	public  void applybutton() {
	//	wait.until(ExpectedConditions.visibilityOf(Applybutton));
		Applybutton.click();
		}
	
	public  void holiday() {
	//	wait.until(ExpectedConditions.visibilityOf(Holiday));
		Holiday.click();
		}
	
	public  void fromcity() {
	//	wait.until(ExpectedConditions.visibilityOf(Fromcity));
		Fromcity.click();
		}
	
	public  void tocity() {
	//	wait.until(ExpectedConditions.visibilityOf(Tocity));
		Tocity.click();
		}
	
	public  void fromcityinput(String Fromcity) {
	//	wait.until(ExpectedConditions.visibilityOf(Fromcityinput));
		Fromcityinput.clear();
		Fromcityinput.sendKeys(Fromcity);
		}
	
	public  void ArrivalCityinput(String Tocity) {
	//	wait.until(ExpectedConditions.visibilityOf(ArrivalCityinput));
		ArrivalCityinput.sendKeys(Tocity);
		}
	
	public  void departureCity() {
	//	wait.until(ExpectedConditions.visibilityOf(DepartureCity));
		DepartureCity.click();
		
		}
	
	public  void arrivalCity() {
	//	wait.until(ExpectedConditions.visibilityOf(ArrivalCity));
		ArrivalCity.click();
		
		}
	public void selectDate() {
		Selectdate.click();
		 

		
	}	

}
	
	