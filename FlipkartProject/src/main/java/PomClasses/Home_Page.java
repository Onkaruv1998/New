package PomClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.UtilityClass;

public class Home_Page extends UtilityClass {

	WebDriver driver;
	
	@FindBy(xpath="//div[text()='Mobiles']")
	WebElement mobiles;
	
	@FindBy(xpath="//div[text()='Akshay']")
	WebElement userID;
	
	@FindBy(xpath="(//a[@class='_2kxeIr'])[10]")
	WebElement logOut;
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);;
		this.driver= driver;
		
	}
	
	public void clickOnMobileCatagory()
	{
		mobiles.click();
	}
	
	public boolean isBannersPageisVisible()
	{
		try {
			WebElement BannerPage=driver.findElement(By.xpath("//h1[@class='_3vKRL2']"));
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public void logOut() throws InterruptedException
	{
		actionClass(driver,userID);
		Thread.sleep(2000);
		List<WebElement>list=driver.findElements(By.xpath("//a[@class='_2kxeIr']"));
		Thread.sleep(2000);
		for(int a=0;a<list.size();a++)
		{
			list.get(a).click();
		}
		
		
	}
		
	
}
