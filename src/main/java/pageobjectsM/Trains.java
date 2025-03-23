package pageobjectsM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class Trains extends Base {
	WebDriver driver;
	public Trains(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//li[@class='menu_Trains']//a")
	WebElement trains;
	
	
	@FindBy(xpath="//span[text()='KJM']/parent::div")
	WebElement Fromstation;
	
	@FindBy(xpath="//span[text()='RJY']/parent::div")
	WebElement tostation;
	
	@FindBy(xpath="//li[text()='First AC']")
	WebElement trainclass;
	
	@FindBy(xpath="//input[@id='1st Class AC - 1A' and @type='checkbox']/parent::span")
	WebElement Checkbox1stclassAC;
	
	public void tostation() {
		tostation.click();
	}
	
	public  void Fromstation() {
		Fromstation.click();
			}
		
		public  void trains() {
			trains.click();
			}
		
		public  void trainclass() {
			trainclass.click();
			}
		
		public  void Checkbox1stclassAC() {
		
			Checkbox1stclassAC.click();
		}
}

