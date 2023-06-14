package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Expedia {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.expedia.co.in/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void expedia()
	{
		driver.findElement(By.xpath("//*[@id=\\\"wizardMainRegionV2\\\"]/div/div/div/div/ul/li[2]/a/span")).click;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//*[@id=\\\"location-field-leg1-origin-menu\\\"]/div/div/div[1]/button"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.findElement(By.xpath("//*[@id=\\\"location-field-leg1-destination-menu\\\"]/div/div/div[1]/button"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement departing = driver.findElement(By.xpath("//*[@id=\\\"d1-btn\\\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement returning = driver.findElement(By.xpath("//*[@id=\\\"d2-btn\\\"]\")"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement traveller = driver.findElement(By.xpath("//*[@id=\\\"adaptive-menu\\\"]/button/svg"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement travellers = driver.findElement(By.xpath("//*[@id=\\\"adaptive-menu\\\"]/button/svg"));	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement adults = driver.findElement(By.xpath("//*[@id=\\\"adaptive-menu\\\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[2]/span/svg"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement childeren = driver.findElement(By.xpath("//*[@id=\\\"adaptive-menu\\\"]/div/div/div/div[2]/section/div[1]/div[2]/div/button[2]/span/svg"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement childage = driver.findElement(By.xpath("//*[@id=\\\"child-age-input-0-0\\\"]"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement done = driver.findElement(By.xpath("//*[@id=\\\"adaptive-menu\\\"]/div/div/div/div[3]/button"));
				
}
}
