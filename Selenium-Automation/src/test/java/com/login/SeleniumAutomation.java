package com.login;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumAutomation {
	@Test
	public void registrationTest()
	{
		System.out.println("starting registration test");
		// create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		sleep(3000);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		driver.navigate().to("https://accounts.lambdatest.com/register");
		System.out.println("page is opened");
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.name("name")).sendKeys("Goutham");
		sleep(1500);
		driver.findElement(By.name("email")).sendKeys("goutham091998@gmail.com");
		sleep(1500);
		driver.findElement(By.name("password")).sendKeys("Goutham*1998");
		sleep(1500);
		driver.findElement(By.name("phone")).sendKeys("7893245496");
		sleep(1500);
		driver.findElement(By.name("org_name")).sendKeys("XYZ.inc");
		driver.findElement(By.name("designation")).sendKeys("Student/Freelancer");
		
		//check box;
		
		driver.findElement(By.className("customcheckbox"));
		sleep(1500);
		driver.findElement(By.xpath("//form[@id='signup-form']//button[@type='submit']")).click();
		sleep(1500);
		 
		 driver.quit();
		
		
		
	}
	@Test
	public void loginTest() {
		
		System.out.println("starting login test");
		// create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		sleep(3000);
		
		//maximize browser window
		driver.manage().window().maximize();
		
		String url = "https://the-internet.herokuapp.com/login";
		//open test page
		driver.get(url );
		System.out.println("page is opened");
		
		//enter username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");
		sleep(1500);
		
		//enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("SuperSecretPassword!");
		sleep(3000);
		
		//click login  button
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		sleep(5000);
		
		//verifications
		
		//new url
		String expetedurl = "https://the-internet.herokuapp.com/secure";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expetedurl,"Actual page url is not the same as expected");
		
		//logout button is visible
		WebElement logoutButton = driver.findElement(By.xpath("//a[@class='button secondary radius']"));
		Assert.assertTrue(logoutButton.isDisplayed(), "LogOut Button is not visible");
	;
	
		//successful login message
		WebElement successMessage = driver.findElement(By.xpath("//div[@id='flash']"));
		String expectedMessage = "You logged into a secure area!";
		String actualMessage = successMessage.getText();

		Assert.assertTrue(actualMessage.contains(expectedMessage),
				"Actual message does not contain expected message.\n Actual Message :" +actualMessage+
				"\nExpected Message:" +expectedMessage);
		//close browser
		driver.quit();
		
	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}