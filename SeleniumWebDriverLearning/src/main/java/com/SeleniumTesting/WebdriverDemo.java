package com.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverDemo {

	public static void main(String[] args) {
		
		//fireFoxDriverTest();
		chromeDriverTest();
		
	}
	
	//Firefox Driver Test
	static void fireFoxDriverTest()
	{
				//instantiate Firefox Driver
				WebDriver driver = new FirefoxDriver();
				
				//Open the browser and navigate to https://www.pluralsight.com/
				driver.get("http://www.pluralsight.com/");
	}
	
	static void chromeDriverTest()
	{
				//instantiate Chrome Driver
				WebDriver driver = new ChromeDriver();
				
				//Open the browser and navigate to https://www.pluralsight.com/
				driver.get("http://www.google.com/");
				
				try {
					
				
				WebElement searchBox = driver.findElement(By.name("q"));
				searchBox.sendKeys("pluralsight");
				searchBox.submit();
				
				WebElement imageLink = driver.findElements(By.linkText("Images")).get(0);
				imageLink.click();
				

				//WebElement myImageElement = driver.findElement(By.id("RoPQRZPodTVxGM:"));
				//WebElement myImageElement = driver.findElement(By.xpath("//*[@id=\"6UslwCqtjDVrEM:\"]"));
				
				WebElement myImageElement = driver.findElements(By.cssSelector("img[class='rg_ic rg_i']")).get(0);

				myImageElement.click();

				}	
				
				catch(Exception ex)
				{
					System.out.println("Exception : " + ex);
				}
				
				
				
				
				
				
	}

}
