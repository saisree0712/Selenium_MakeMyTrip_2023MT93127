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

import Base.Base;

public class Flights extends Base {

	WebDriver driver;
	public Flights(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(xpath="//li[@class='menu_Flights']//a")
	WebElement Flights;
	
	@FindBy(css="label[for='fromCity']")
	WebElement Fromcity;
	
	@FindBy(css="label[for='toCity']")
	WebElement Tocity;
	
	@FindBy(css="input[placeholder='From']")
	WebElement Fromcityinput;
	
	@FindBy(xpath="(//p[text()='Bengaluru, India'])[last()]")
	WebElement DepartureCity;
	
	@FindBy(xpath="//input[@placeholder='To']")
	WebElement ArrivalCityinput;
	
	@FindBy(xpath="//p[text()='Hyderabad, India']/parent::div")
	WebElement ArrivalCity;
	
	@FindBy(xpath="//button[text()='APPLY']")
	WebElement Applybutton;
	
	@FindBy(xpath="//a[text()='Search']")
	WebElement searchbutton;
	
	@FindBy(xpath="//p[text()='Popular Filters']")
	WebElement PopularFilters;
	
	@FindBy(xpath="//div[@class='DayPicker-Day' and @aria-label='Tue Apr 08 2025']")
	WebElement Selectdate;
	
	@FindBy(xpath="//label[@for='travellers']")
	WebElement travellers;
	
	@FindBy(xpath="//li[@data-cy='adults-3' ]")
	WebElement adultcount;
	
	@FindBy(xpath="//p[text()='Stops From Bengaluru']")
	WebElement Stops;
	
	public void stops() {
		Actions a = new Actions(driver);
		a.scrollToElement(Stops);
	}
	public void adultscounts() {
		adultcount.click();
	}
	public  void travellers() {	
		travellers.click();
			}
	
	public  void PopularFilters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Popular Filters']")));
		
		}
	
	public  void searchbutton() {
	//	wait.until(ExpectedConditions.visibilityOf(searchbutton));
		searchbutton.click();
		}
	
	public  void applybutton() {
	//	wait.until(ExpectedConditions.visibilityOf(Applybutton));
		Applybutton.click();
		}
	
	public  void flights() {
	//	wait.until(ExpectedConditions.visibilityOf(Holiday));
		Flights.click();
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
	
	
