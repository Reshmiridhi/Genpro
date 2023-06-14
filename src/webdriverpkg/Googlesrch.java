package webdriverpkg;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesrch {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
	driver = new ChromeDriver();	
}
	@Test
	public void test()
	{
		driver.get("https://www.google.com");
		  WebElement search=driver.findElement(By.name("q"));
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  search.sendKeys("Technopark");
		  search.submit();
		   driver.findElement(By.name("btnk")).click();
	}                                                                                                                                          
	
}
