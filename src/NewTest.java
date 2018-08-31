import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivamsohane\\workspace\\Selenium_Project\\Driver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://s-c-login.cengagebrain.com/cb/regionCookie.htm");
		WebElement Cookies = driver.findElement(By.xpath("//a[@class='medium_green_button'][text()='Set Cookies']"));
		Cookies.click();
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
