package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNgProgram {
	
	@Test
	public void LoginInApplication(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shivamsohane\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.navigate().back();
	}

}
