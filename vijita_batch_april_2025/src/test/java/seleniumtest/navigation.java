package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.helper;

public class navigation {
@Test
	
	public void testnav()
	{
		WebDriver driver=helper.Launchbrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://demo.guru99.com/V4/index.php");
		driver.navigate().back();
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
	}
}
