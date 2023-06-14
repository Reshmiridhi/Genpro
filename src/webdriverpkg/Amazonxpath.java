package webdriverpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonxpath {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
	driver=new ChromeDriver();
	}
	@Test
	public void test1()
	{
		driver.get("https://amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("pqrs@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
		driver.findElement(By.xpath("//*[@class='hm-icon nav-sprite']")).click();
		
		
		
		
		
	}
}