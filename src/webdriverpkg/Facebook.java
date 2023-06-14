package webdriverpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
	driver = new ChromeDriver();	
}
	@Test
	public void test()
	{
		driver.get("https://www.facebook.com");
		   driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		   driver.findElement(By.name("pass")).sendKeys("hello123");
		   driver.findElement(By.name("login")).click();
	}                                                                                                                                          
	
}