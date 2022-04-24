package seleniumscriptsday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XPATHFunctionsDemo {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
	        
	        Select dd = new Select(driver.findElement(By.xpath("//select[@name='coffee']")));
	        
	        
	        dd.selectByValue("black"); // black option
	        
	        Thread.sleep(2000);
	        
	        
	        dd.selectByIndex(2); // with sugar
	        
	        Thread.sleep(2000);
	        
	        dd.selectByVisibleText("With cream & sugar");

	}

}
