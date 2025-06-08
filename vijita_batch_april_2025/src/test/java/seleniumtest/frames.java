package seleniumtest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class frames {

	public static WebDriver driver;
  @BeforeClass
  public void beforeclass()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\training\\browserdriver\\chromedriver-win64\\chromedriver.exe");
		 driver= new ChromeDriver();

		driver.get("https://practiceseleniumelements.blogspot.com/2021/08/iframes.html");
		driver.manage().window().maximize();
  }
  @Test
  
  public void test() throws InterruptedException
  {
	  driver.switchTo().frame("simplealert");
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  Alert a=driver.switchTo().alert();
	  Thread.sleep(500);
	  a.accept();
	 // driver.switchTo().parentFrame();
	  driver.switchTo().frame("autocomplete");
	  driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("ind");
  }
}
