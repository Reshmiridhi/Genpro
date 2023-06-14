package webdriverpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Listtagname {
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
		List<WebElement> l =driver.findElements(By.tagName("a"));
		System.out.println(l.size());
		
		String name = WebElement.getText();
		System.out.println(name);		
}
}
