package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {

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
			driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
			while(true)
			{
				WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]"));
				
				String month1=month.getText();
				if(month1.equals("May 2018"))
				{
					System.out.println("month");
					break;
				}
				else
				{
					driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]"));
					
				}
				
			}
			
		List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[]/td[]/button"));
		for(WebElement dateelement:alldates)
		{
			String date=dateelement.getAttribute("data-day");
			System.out.println(date);
			if(date.equals("22"))
			{
				System.out.println(date);
				dateelement.click();
				System.out.println("date selected");
			}}}}