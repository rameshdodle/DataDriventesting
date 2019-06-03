package com.basictest.brosers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {
	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
		driver.get("https://classic.crmpro.com/index.html");
		System.out.println("Before loging page title is  ="+driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		driver.findElement(By.xpath(" //*[@type='submit']")).click();
		Thread.sleep(3000);
		System.out.println("After login Page Title is ="+driver.getTitle());
		driver.close();
		
	}

}
