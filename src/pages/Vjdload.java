package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vjdload {
	ChromeDriver driver;
	By Source= By.xpath("//*[@id=\"FromCity\"]");
	By Destination=By.xpath("//*[@id=\"ToCity\"]");
	By Departure=By.xpath("//*[@id=\"txtFromDate\"]");
By Searchbutton=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
	
	public  Vjdload(ChromeDriver driver)
	{
		this.driver=driver;		
		
	
}
	public void setvalues(String source, String destination, String departure) throws Exception{
	{
		driver.findElement(Source).sendKeys(source,keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(Destination).sendKeys(destination,keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(Departure).sendKeys(departure);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
		
	
}
	public void searchbuttonclick() {

		driver.findElement(Searchbutton).click();
		
		
		
	}

		
	}
