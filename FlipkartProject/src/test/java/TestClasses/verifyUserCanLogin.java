package TestClasses;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PomClasses.Home_Page;
import PomClasses.Login_Page;

public class verifyUserCanLogin {

	WebDriver driver;
	Login_Page lp;
	Home_Page hp;
	
	@BeforeClass()
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\FlipkartProject\\src\\main\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	
	}
	
	@BeforeMethod()
	public void beforeMethod()
	{
		lp=new Login_Page(driver);
		hp=new Home_Page(driver);
	}
	
	@Test()
	public void verifyUserCanLogin() throws IOException, InterruptedException
	{
		lp.enterEmail();
		lp.enterPassword();
		lp.clickLoginButton();
		Thread.sleep(5000);
		SoftAssert sf=new SoftAssert();
		sf.assertTrue(lp.isHomePagevisible());
		sf.assertAll();
		sf.assertTrue(lp.isCatagoryListVissible());
		sf.assertTrue(lp.isSearchforProductTextBoxPresentOnHomePage());
		sf.assertTrue(lp.isSearchButtonPresentRightOfTheTextBox());
		sf.assertTrue(lp.isCartButtonAvailableOnHomePage());
	}
	
	@org.testng.annotations.AfterMethod()
	public void AfterMethod() throws InterruptedException 
	{
		hp.logOut();
		System.out.println("pass");
	}
	
	@AfterClass()
	public void afterClass()
	{
		driver.close();
	}
}
