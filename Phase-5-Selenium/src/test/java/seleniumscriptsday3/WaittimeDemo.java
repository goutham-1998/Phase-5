package seleniumscriptsday3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaittimeDemo {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		
		//Implicit Wait time Example:Applied for every element
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gmail.com");
		
		
		//Explicit wait time : Applied for single element
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='email']")))).sendKeys("admin@gmail.com");
		
	
	}

}
