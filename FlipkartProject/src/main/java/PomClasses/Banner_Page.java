package PomClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.UtilityClass;

public class Banner_Page extends UtilityClass {

	WebDriver driver;
	
	@FindBy(xpath="(//img[@alt='Infinix Hot 12 Play - En'])[2]")
	WebElement productBanner;
	
	public Banner_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	public void clickOnProductBanner()
	{
		scrolling(driver,"window.scrollBy(0,1000)");
		productBanner.click();
	}
	
	public boolean isProductListPageVisible()
	{
		try {
			List<WebElement>list=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	
	
	
	
	
	
	
}
