package PomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {

	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Cart']")
	WebElement cartOption;
	
	public Cart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickOnCartButton()
	{
		cartOption.click();
		
	}
	
	
	public boolean isCartPageEmpty()
	{
		try {
			WebElement cartIsEmpty=driver.findElement(By.xpath("//div[text()='Your cart is empty!']"));
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean isProductAddInCart()
	{
		try {
			WebElement addedProduct=driver.findElement(By.xpath("//a[text()='Infinix HOT 12 Play (Daylight Green, 64 GB)']"));
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
