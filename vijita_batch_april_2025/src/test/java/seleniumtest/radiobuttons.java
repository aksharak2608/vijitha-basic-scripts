package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class radiobuttons {
	public static WebDriver driver;
  @BeforeClass
  public void beforeclass()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\training\\browserdriver\\chromedriver-win64\\chromedriver.exe");
		 driver= new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
  }
  
  
  @Test
  public void login() {
	  try {
			Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//a/span[text()='My Info']")).click();
			Thread.sleep(2000);
		
	  }
	  catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  
  }
  @Test
  public void radio() {
	  try {
		  JavascriptExecutor js=  (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,300)");
		  List<WebElement> R_button=driver.findElements(By.xpath("//div[@class='--gender-grouped-field']//input"));
		  for(WebElement ele:R_button)
		  {
			  if(ele.getAttribute("value").contains("1"))
			  {
				  System.out.println("verifying for male radiobutton.");
				  System.out.println(ele.isSelected());
				  if(!ele.isSelected())
				  {
					  driver.findElement(By.xpath("//label[text()='Male']")).click();
				  }
				  else
				  {
					 // count++;
				  }
				  
			  }
			  else
			  {
				  System.out.println("verifying for female radiobutton.");
				  System.out.println(ele.isSelected());
				  if(!ele.isSelected())
				  {
					  driver.findElement(By.xpath("//label[text()='Female']")).click();
				  }
			  }
		  }
			  WebElement checkbox=driver.findElement(By.xpath("//div[@role='table']//div[@class='oxd-table-body']//input[@type='checkbox'][@value='0']"));
		  js.executeScript("arguments[0].scrollIntoView(true);", checkbox);
		  if(checkbox.isSelected())
		  {
			  System.out.println("record selecetd.");
		  }
		  else
		  { System.out.println("record not selecetd.");
		  driver.findElement(By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]")).click();
		  }
		  
	  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
