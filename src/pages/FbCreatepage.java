package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbCreatepage {
	ChromeDriver driver;
	
	By CreateaPage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By GetStarted=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	
	public FbCreatepage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	public void CreateaPageclick()
	{
		driver.findElement(CreateaPage).click();
	}
	public void GetStartedclick()
	{
		System.out.println("hai");
		driver.findElement(GetStarted).click();
	}

}
