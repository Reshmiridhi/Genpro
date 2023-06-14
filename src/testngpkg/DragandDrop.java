package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
	driver = new ChromeDriver();	
}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable/");
}
	@Test
	public void draganddrop()
	{
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		String exptext="Dropped!";
		String actualtext=drop.getText();
		if(exptext.equals(actualtext))
		{
			System.out.println("Dropped");
		}
		else
			{
				System.out.println("no change");
				
			}
			}
		}
	

