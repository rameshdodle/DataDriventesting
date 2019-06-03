package com.basictest.brosers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMomenthandling2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'MENU')]")))
		.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Travel Info')]")))
		.build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'FAQ')]"));

		


	}

}
