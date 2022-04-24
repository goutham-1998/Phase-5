package seleniumscriptsday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("login")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("passwd")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.name("proceed")).click();

	}

}
