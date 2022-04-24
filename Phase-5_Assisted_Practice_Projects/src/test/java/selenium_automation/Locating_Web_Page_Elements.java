package selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_Web_Page_Elements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_19f32o2up6_e&adgrpid=64607481971&hvpone=&hvptwo=&hvadid=486454059767&hvpos=&hvnetw=g&hvrand=2987457740941062627&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299773&hvtargid=kwd-297775402051&hydadcr=5650_2175716&gclid=Cj0KCQjwr-SSBhC9ARIsANhzu14Q33LSJj4NQ9VK5nSyDmMn4GyZYiTWJEIQpwjCi2kJHMYgdQ-JxcgaAqFGEALw_wcB");
		
		//Using Name as a Locator
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus");
		
		//Using class name as a Locator
		driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("Phone");

	}

}
