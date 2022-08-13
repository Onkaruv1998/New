package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetails_Page {

	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='_2C41yO'])[2]")
	WebElement greenColourMobile;
	
	@FindBy(xpath="(//button[contains(@class,'_2KpZ6l _2U9uOA')])[1]")
	WebElement addToCart;
	
	public ProductDetails_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void changeProductColour()
	{
		greenColourMobile.click();
	}
	
	public void clickOnAddTocart()
	{
		addToCart.click();
	}
}
