package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Vjdload;

public class VjdTest {
	ChromeDriver driver;
	@BeforeTest
public void setup() throws Exception{
		driver=new ChromeDriver();
			driver.get("https://www.vrlbus.in/");
		Thread.sleep(8000);
	}
	@Test
	public void load()  throws Exception{
		Vjdload ob=new Vjdload(driver);
		ob.setvalues("Ahmedabad", "Bangalore", "20-04-2023");
	ob.searchbuttonclick();
	}

}
