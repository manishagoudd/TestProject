package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestProject1 {
	
	@Test
	public void Testing() throws InterruptedException
	{
	System.out.println("flipkart started");
	//create webpage
	System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	//open url
	System.out.println("Page is open");
	driver.get("https://www.flipkart.com/account/login");
	Thread.sleep(3000);
	//maximizing the browser
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//enter username
	WebElement user=driver.findElement(By.cssSelector("[autocomplete] ._351hSN:nth-of-type(1) ._2IX_2-"));
	user.sendKeys("manishaasagoni@yahoo.com");
	// enter password
	WebElement pass=driver.findElement(By.cssSelector(".VJZDxU._2IX_2-._3mctLh"));
	pass.sendKeys("Manisha@");
	//login page
	WebElement login=driver.findElement(By.cssSelector("._2HKlqd._2KpZ6l._3AWRsL > span"));
	login.click();
	Thread.sleep(3000);
	//closing the browser
	driver.quit();
	
	
	
	
	
	
	
	}

}
