package seleniumscriptsday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextLocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		driver.findElement(By.linkText("Contents")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("Title of the linked page is : "+title);
		Thread.sleep(1500);
		driver.findElement(By.linkText("About Wikipedia")).click();
		Thread.sleep(2000);
		String title1 = driver.getTitle();
		System.out.println("Title of second linked page is: "+title1);
		Thread.sleep(1500);
		
		driver.navigate().back();
		Thread.sleep(1500);
		
		driver.navigate().forward();
		

	}

}
