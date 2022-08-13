package PomClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.UtilityClass;

public class ProductList_Page extends UtilityClass{

	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='_4rR01T'])[1]")
	WebElement product;
	
	public ProductList_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public boolean isSortOptionsVisible()
	{
		try {
			List <WebElement>list=driver.findElements(By.xpath("//div[contains(@class,'_10UF8M')]"));
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	public void selectProductFromProductList()
	{
		product.click();
	}
	
	public boolean isProductDetailsPageVisible()
	{
		try {
			switchWindow(driver,1);
			WebElement addToCartButton=driver.findElement(By.xpath("(//button[contains(@class,'_2KpZ6l')])[1]"));
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
}
