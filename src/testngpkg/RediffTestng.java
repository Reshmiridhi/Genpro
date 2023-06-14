package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class RediffTestng {
	
	{
	driver = new ChromeDriver();	
}
	@BeforeTest
	public void urlloading()
	{
		driver.get("https://www.google.com");
		}
}
