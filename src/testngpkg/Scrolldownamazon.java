package testngpkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Scrolldownamazon {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
	driver = new ChromeDriver();	
}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.amazon.in");
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("Window.scrollBy(0,document.body.scrollHeight)");
}

}
