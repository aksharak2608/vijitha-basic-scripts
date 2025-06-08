package seleniumtest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class usingannotations {
	public static WebDriver driver;
  @Test(dependsOnMethods = "login")
  public void test1() {
	  try {
		  
	  driver.findElement(By.xpath("//a/span[text()='My Info']")).click();
		Thread.sleep(2000);
		String name="//label[text()='Employee Full Name']//parent::div//following-sibling ::div[@class='--name-grouped-field']/div/div[2]/input[@name='%s']";
		clearAndSendvalue("firstName","fname");
		clearAndSendvalue("middleName","bcsd");
		clearAndSendvalue("License Number","354345");
		
	  }
	  catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  
  }
  @Test(dependsOnMethods = "test1" , enabled=false)
  public void test2() {
	  try {
		  String day="//div[@class='oxd-calendar-wrapper']//div[@class='oxd-calendar-dates-grid']//div[contains(@class,'oxd-calendar-date')][text()='%s']";
	  String monthvalues="//div[@class='oxd-calendar-wrapper']//div[@class='oxd-calendar-header']//li[contains(@class,'oxd-calendar-selector-month')]//ul/li";
		driver.findElement(By.xpath("//label[text()='License Expiry Date']//parent::div//following-sibling ::div//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='oxd-calendar-wrapper']//div[@class='oxd-calendar-header']//li[@class='oxd-calendar-selector-month']//i")).click();
	  List<WebElement> mon=driver.findElements(By.xpath(monthvalues));
	  List<String> expected=new ArrayList();
	  expected.add("January");
	  expected.add("February");
	  expected.add("March");
	  expected.add("April");
	  List<String> monthip=new ArrayList();
	  System.out.println(mon.size());
		  for(WebElement ele:mon)
		  {
			  System.out.println(ele.getText());
			  monthip.add(ele.getText().toString());
		  }
		  Thread.sleep(2000);
		  for(WebElement ele:mon)
		  {
			  if(ele.getText().equals("September"))
			  {
				  ele.click();
			  break;
			  
			  }
			  driver.findElement(By.xpath(String.format(day, "25"))).click();
		  }
		  
		 System.out.println( monthip.containsAll(expected));
		// monthip.
		
	  }
	  
	  catch (Exception e) {
			// TODO Auto-generated catch block

		  e.printStackTrace();
		}
	  
	  
  }
  @Test(dependsOnMethods = "test1")
  public void test3() {
	  try {
		  JavascriptExecutor js = (JavascriptExecutor) driver; 
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
		  
		  
		  
		  
  }
	  
	  catch (Exception e) {
			// TODO Auto-generated catch block

		  e.printStackTrace();
		}
	  }
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
		
	  }
	  catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  
  }
  public static void clearAndSendvalue(String fieldname, String input)
	{
		String alltextfields="//label[contains(text(),'%1$s')]//parent::div//following-sibling ::div[@class='--name-grouped-field']/div/div[2]/input[contains(@name,'%2$s')]|"
				+ "//label[contains(text(),'%2$s')]//parent::div//following-sibling ::div//input";
		WebElement field;
		System.out.println(String.format(alltextfields, "Employee Full Name",fieldname));
		field=driver.findElement(By.xpath(String.format(alltextfields, "Employee Full Name",fieldname)));
		field.click();
		field.sendKeys(Keys.CONTROL+"a");
		field.sendKeys(Keys.DELETE);
		field.sendKeys(input);
		
	}
}
