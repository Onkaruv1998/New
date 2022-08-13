package UtilityClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UtilityClass {

	public static String UseProperties(String key) throws IOException
	{
	FileInputStream fs=new FileInputStream("D:\\Eclipse\\FlipkartProject\\Configurations\\config.properties");
		Properties pr=new Properties();	
		pr.load(fs);
		return pr.getProperty(key);
	}
	
	public static void scrolling(WebDriver driver,String scale)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript(scale);
		
	}
	
	public static void switchWindow(WebDriver driver,int a)
	{
		Set<String>address=driver.getWindowHandles();
		List<String>addresses=new ArrayList<String>(address);
		driver.switchTo().window(addresses.get(a));
	}
	
	public static void actionClass(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element);
	}
}
