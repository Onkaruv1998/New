package PomClasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.UtilityClass;

public class Login_Page extends UtilityClass {
	
	WebDriver driver;

	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement loginButton;
	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void enterEmail() throws IOException
	{
		email.sendKeys(UseProperties("email"));
	}
	
	public void enterPassword() throws IOException
	{
		password.sendKeys(UseProperties("password"));
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	public boolean isHomePagevisible()
	{
		try {
			WebElement usename=driver.findElement(By.xpath("//div[text()='Akshay']"));
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean isCatagoryListVissible()
	{
		try{
			List<WebElement> list=driver.findElements(By.xpath("//div[@class='xtXmba']"));
		String b = null;
		for(int a=0;a<list.size();a++)
		{
			 b=list.get(a).getText();
		}
		String c="Mobiles\r\n"
				+ "Fashion\r\n"
				+ "Electronics\r\n"
				+ "Beauty\r\n"
				+ "Home\r\n"
				+ "Appliances\r\n"
				+ "Furniture\r\n"
				+ "Travel\r\n"
				+ "Grocery";
		if(b.equals(c))
		{
			return true;
		}
			return true;
		
		}catch(Exception e)
		{
			return false ;
		}
	}
		
		public boolean isSearchforProductTextBoxPresentOnHomePage()
		{
			try {
				WebElement SearchforProductTextBox=driver.findElement(By.xpath("//input[@name='q']"));
				return true;
			}catch(Exception e) {
				return false;
			}
		}
		
		public boolean isSearchButtonPresentRightOfTheTextBox()
		{
			try {
				WebElement SearchButton=driver.findElement(By.xpath("//button[@type='submit']"));
				return true;
			}catch(Exception e) {
				return false;
			}
		}
		
		public boolean isCartButtonAvailableOnHomePage()
		{
			try {
				WebElement CartButton=driver.findElement(By.xpath("//span[text()='Cart']"));
				return true;
			}catch(Exception e) {
				return false;
			}
		}
		
	
	
	
	
	
	
	
	
	
}
