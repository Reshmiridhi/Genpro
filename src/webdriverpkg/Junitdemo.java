package webdriverpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void test() {
		driver.get("https://www.facebook.com");
	}
	@After
	public void teardown()
	{
		driver.quit();
	}

}
