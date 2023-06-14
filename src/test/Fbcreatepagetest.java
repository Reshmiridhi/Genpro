package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FbCreatepage;

public class Fbcreatepagetest {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test2()
	{
		FbCreatepage ob1=new FbCreatepage(driver);
		ob1.CreateaPageclick();
		ob1.GetStartedclick();
	}

}
