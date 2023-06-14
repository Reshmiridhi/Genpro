package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expediapage {
	ChromeDriver driver;
	By flight = By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span");
	By leavingfrom = By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div/div/div[1]/button");
	By goingto = By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div/div/div[1]/button");
	By departing = By.xpath("//*[@id=\"d1-btn\"]");
	By returning = By.xpath("//*[@id=\"d2-btn\"]");
	By traveller = By.xpath("//*[@id=\"adaptive-menu\"]/button/svg");
	By travellers = By.xpath("//*[@id=\"adaptive-menu\"]/button/svg");
	By adults = By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[2]/span/svg");
	By children = By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[2]/div/button[2]/span/svg");
	By childage= By.xpath("//*[@id=\"child-age-input-0-0\"]");
	By done = By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[3]/button");

	public  Expediapage (ChromeDriver driver)
	{
		this.driver=driver;	
	}



}


