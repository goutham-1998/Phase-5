package seleniumscriptsday3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAnnotation2 {
	
WebDriver driver;
    
    @BeforeClass
    public void openBrowser()
    {
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.manage().deleteAllCookies();
        
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
        
    }
	
    @Test(priority='1')
    public void dropdown() throws InterruptedException
    {
       Select dd = new Select(driver.findElement(By.xpath("//select[@name='coffee']")));
        
        
        dd.selectByValue("black"); // black option
        
        Thread.sleep(2000);
    }
    

@Test(priority='2')
    public void checkbox() throws InterruptedException
    {
        driver.navigate().to("https://www.ironspider.ca/forms/checkradio.htm");
        
        driver.findElement(By.xpath("//input[@value='red']")).click();
        
        Thread.sleep(1500);
        
        driver.findElement(By.xpath("(//input[starts-with(@type,'check')])[3]")).click();
        
        
        Thread.sleep(1500);
        
    }

@Test(priority='3')
    public void login()
    {
        driver.navigate().to("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Special%3ASearch&returntoquery=search%3D%26go%3DGo");
        
        driver.findElement(By.id("wpName1")).sendKeys("admin");
    
        driver.findElement(By.id("wpPassword1")).sendKeys("admin@123");
    }
    
    @AfterClass
    public void closebrowser()
    {
        driver.close();
    }
}