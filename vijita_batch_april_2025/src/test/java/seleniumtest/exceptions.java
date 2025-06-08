package seleniumtest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class exceptions {

	public static WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeclass()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\training\\browserdriver\\chromedriver-win64\\chromedriver.exe");
		 driver= new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
  }
  
  
  
  public void login() throws InterruptedException {
	  
			Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password1']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//a/span[text()='My Info']")).click();
			Thread.sleep(2000);
		
	  }
  @Test
	  public void windowtest() throws InterruptedException
	  {Thread.sleep(4000);
		  String mainwindow=driver.getWindowHandle();
		  driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
		  Set<String> multip=driver.getWindowHandles();
		  
		  for(String cwin:multip)
		  {
			  if(!cwin.equalsIgnoreCase(mainwindow))
			  {
				  driver.switchTo().window(cwin);
				  Thread.sleep(500);
				  System.out.println(driver.getTitle());
				  driver.close();
				  System.out.println(driver.getTitle());
			  }
		  }
	  }
	  
	  
  
}
