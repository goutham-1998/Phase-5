package seleniumscriptsday3;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;

public class GridDemo {
	
	WebDriver driver;

	@BeforeClass
	public void startBrowser() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.WIN10);
		cap.setBrowserName("chrome");
		
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubURL = "http://192.168.29.237:4545/wd/hub";
		
		driver = new RemoteWebDriver(new URL(hubURL),options);
	}
	
	public void testmethod1()
	{
		driver.get("https://www.wikipedia.org/");
		System.out.println(driver.getTitle());
	}

}
