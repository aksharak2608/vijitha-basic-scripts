package coreJavaConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.helper;

public class alerts {
	//WebElement Tryit=driver.fin
	By tryit=By.xpath("//button[text()='Try it']");
	By ConfirmAlert=By.xpath("//button[text()='Confirm Alert']");
	By PromptAlert=By.xpath("//button[text()='Prompt Alert']");
	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver= helper.Launchbrowser("https://practiceseleniumelements.blogspot.com/2021/08/simple-alert.html");
		//driver.get("https://practiceseleniumelements.blogspot.com/2021/08/simple-alert.html");
		driver.findElement(tryit).click();
		Thread.sleep(1000);
		Alert a= driver.switchTo().alert();
		a.accept();
		driver.findElement(ConfirmAlert).click();
		Thread.sleep(1000);
		a.dismiss();
		driver.findElement(PromptAlert).click();
		a.sendKeys("ak");
		a.accept();
	}

}
