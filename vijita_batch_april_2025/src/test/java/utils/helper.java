package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class helper {
	public static WebDriver driver;
	public static WebDriver Launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\training\\browserdriver\\chromedriver-win64\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
public static WebDriver Launchbrowser(String url)
{
	
	 WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.get(url);
	
	return driver;
	
}
}
