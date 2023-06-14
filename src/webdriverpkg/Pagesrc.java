package webdriverpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesrc {

	public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
  String src=driver.getPageSource(); //returns page source
  if(src.contains("Gmail"))
  {
	  System.out.println("present");
  }
  else
  {
	  System.out.println("not present");
  }
	}

}
