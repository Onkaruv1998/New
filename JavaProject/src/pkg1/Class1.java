package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Driver2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(20000);
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='xtXmba']"));
		for(int a=0;a<list.size();a++)
		{
			String b=list.get(a).getText();
			System.out.println(b);
		}
	}

}
