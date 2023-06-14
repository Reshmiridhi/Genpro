package testngpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertest {
	
		ChromeDriver driver;
		@BeforeTest
		public void setUp()
		{
		driver = new ChromeDriver();	
	}
		@Parameters("a")
		@Test
		public void test1(String a)
		{
			driver.get("https://www.google.com");
			   driver.findElement(By.name("q")).sendKeys(a,Keys.ENTER);
		}                                                                                                                                          
		
	}

