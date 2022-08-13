package TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PomClasses.Home_Page;
import PomClasses.Login_Page;

public class verifyUserCanChooseCatagory {

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
	
	@Test(priority=1)
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
	}
		
	@Test(priority=2)
	public void verifyUserCanChooseCatagory() throws InterruptedException
	{
		hp.clickOnMobileCatagory();
		Thread.sleep(5000);
		Assert.assertTrue(hp.isBannersPageisVisible());
		
	}
	
	@AfterMethod()
	public void afterMethod() throws InterruptedException
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
