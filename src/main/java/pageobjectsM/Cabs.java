package pageobjectsM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cabs {
	WebDriver driver;
	public Cabs(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//li[@class='menu_Cabs']//a")
	WebElement cabs;
	
	
	@FindBy(xpath="//span[text()='Bangalore, Karnataka, India']")
	WebElement StartCity;
	
	@FindBy(xpath="//span[text()='Hyderabad, Telangana, India']")
	WebElement toCity;
	
	@FindBy(xpath="//label[@for='departure']")
	WebElement departuredate;
	
	
	
	public void cabs() {
		cabs.click();
	}
	
	public  void StartCity() {
		StartCity.click();
			}
		
		public  void toCity() {
			toCity.click();
			}
		
		public  void departuredate() {
			departuredate.click();
			}
		
}
