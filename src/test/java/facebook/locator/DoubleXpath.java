package facebook.locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleXpath {
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void doubleXpathTest() {
		driver.findElement(By.xpath("//input[@id='email'] [@name='email']")).sendKeys("fgbc");
		
	}
	@Test
	public void orCondition() {
		driver.findElement(By.xpath("//input[@id='pass' or @name='pass']")).sendKeys("sdcx");
	}
	@Test
	public void andCondition() {
		driver.findElement(By.xpath("//button[@name='login' and @class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
	}
	

}
