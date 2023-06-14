package webdriverpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
	driver = new ChromeDriver();	
}
	@Test
	public void test()
	{
		driver.get("file:///C:/Users/Administrator/Desktop/JAVA%20PGM/New%20folder/alert.html");
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		a.accept();
		  driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Reshmi");
		  driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("SR");
}
}
