package test;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class Expediatest {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		
		driver.get("https://www.expedia.com");
	}
}
