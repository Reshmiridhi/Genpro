package webdriverpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownrediff {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
	driver = new ChromeDriver();	
}
	@Test
	public void test()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select (dayelement);
		day.selectByVisibleText("05");
		WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select month=new Select (monthelement);
		month.selectByVisibleText("JAN");
		WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select year=new Select (yearelement);
		year.selectByVisibleText("1994");
	}
}