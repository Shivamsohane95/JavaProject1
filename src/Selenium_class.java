import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_class {
	
	public static  WebDriver driver =  new ChromeDriver();
	
	
	public static void SetCookies()
	{
		
		
		driver.manage().window().maximize();
		driver.navigate().to("https://s-c-login.cengagebrain.com/cb/regionCookie.htm");
		WebElement LogIn = driver.findElement(By.xpath("//a[@class='medium_green_button']"));
		LogIn.click();
		return;
		
	}
	public static  void EnterAccessCode()
	{
		
		driver.manage().window().maximize();
		driver.navigate().to("https://s-c-login.cengagebrain.com/cb/regionCookie.htm");
		WebElement LogIn = driver.findElement(By.xpath("//a[@class='medium_green_button']"));
		LogIn.click();
		return;
		
	}
}

	
	


