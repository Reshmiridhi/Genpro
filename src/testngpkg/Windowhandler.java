package testngpkg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Windowhandler {
	
	d=new ChromeDriver();
	
}
@Test
public void test()
{
	d.get("http://demo.guru99.com/popup.php");
	String parentWindow=d.getWindowHandle();
	System.out.println("Parent Window Title"+d.getTitle());
	d.findElement(By.xpath("/html/body/p/a")).click();
	
	
	set<String> allWindowHandles=d.getWindowHandles():
		
		for (String handle : allWindowHandles) 
		{
		System.out.println(handle);
		if(!handle.equalsIgnoreCase(parentWindow))
		{
			d.switchTo().window(handle);
			String s= d.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).getText();
			System.out.println(s);
			

}
