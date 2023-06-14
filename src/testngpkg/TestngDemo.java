package testngpkg;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
	driver = new ChromeDriver();	
}
	@BeforeTest
	public void urlloading()
	{
		driver.get("https://www.google.com");
		}
	@Test(priority=2)
	public void test1()
	{
		System.out.println("test1");
		
	}
	@Test(priority=1)
	public void test2()
	{
		System.out.println("test2");
		
	}
	@AfterMethod
	public void aftmthd()
	{
		System.out.println("aftermethod");
	}
	@AfterTest
	public void browsequit()
	{
		driver.quit();
	}
}
