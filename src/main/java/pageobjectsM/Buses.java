package pageobjectsM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buses {
	WebDriver driver;
	public Buses(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//li[@class='menu_Buses']//a")
	WebElement buses;
	
	
	@FindBy(xpath="//span[text()='Bangalore, Karnataka']")
	WebElement StartCity;
	
	@FindBy(xpath="//span[text()='Hyderabad, Telangana']")
	WebElement toCity;
	
	@FindBy(xpath="//span[text()='AC']/parent::div")
	WebElement ACbus;
	
	@FindBy(xpath="//span[text()='Sleeper']/parent::div")
	WebElement Sleeperbus;
	
	
	public void buses() {
		buses.click();
	}
	
	public  void StartCity() {
		StartCity.click();
			}
		
		public  void toCity() {
			toCity.click();
			}
		
		public  void ACbus() {
			ACbus.click();
			}
		
		public  void Sleeperbus() {
		
			Sleeperbus.click();
		}
}
