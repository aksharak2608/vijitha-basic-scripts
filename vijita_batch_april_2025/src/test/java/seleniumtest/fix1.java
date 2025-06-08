package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fix1 {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\training\\browserdriver\\chromedriver-win64\\chromedriver.exe");
		 driver= new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
			Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/span[text()='My Info']")).click();
		Thread.sleep(2000);
		String name="//label[text()='Employee Full Name']//parent::div//following-sibling ::div[@class='--name-grouped-field']/div/div[2]/input[@name='%s']";
		clearAndSendvalue("firstName","fname");
		clearAndSendvalue("middleName","bcsd");
		clearAndSendvalue("License Number","354345");
		
		
		
		} catch (InterruptedException e) {
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
