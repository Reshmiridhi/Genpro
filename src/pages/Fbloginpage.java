package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbloginpage {
ChromeDriver driver;

By Fbloginemail=By.id("email"); 
By Fbloginpswd=By.id("pass");
By Loginbutton=By.name("login");

public Fbloginpage(ChromeDriver driver)
{
	this.driver=driver;
}

public void setvalues(String email, String password)
{
	driver.findElement(Fbloginemail).sendKeys(email);
    driver.findElement(Fbloginpswd).sendKeys(password);	
}
public void login()
{
	driver.findElement(Loginbutton).click();
}
}
