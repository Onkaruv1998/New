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

import PomClasses.Banner_Page;
import PomClasses.Home_Page;
import PomClasses.Login_Page;
import PomClasses.ProductList_Page;

public class verifyUserCanSeeProductDetailsWhileSelectProduct {

	WebDriver driver;
	Login_Page lp;
	Home_Page hp;
	Banner_Page bp;
	ProductList_Page pp;
	
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
		bp=new Banner_Page(driver);
		pp=new ProductList_Page(driver);
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
	
	@Test(priority=3)
	public void verifyUserCanSeeProductDetailsWhileSelectProduct() throws InterruptedException
	{
		bp.clickOnProductBanner();
		Thread.sleep(5000);
	    Assert.assertTrue(bp.isProductListPageVisible());
	    Assert.assertTrue(pp.isSortOptionsVisible());
	    pp.selectProductFromProductList();
	    Assert.assertTrue(pp.isProductDetailsPageVisible());
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
