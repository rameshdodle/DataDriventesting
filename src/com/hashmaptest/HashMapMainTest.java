package com.hashmaptest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashMapMainTest extends HashMapTestData{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String customerdetails=HashMapTestData.multipleUsers().get("customer");
		String customerInfo[]=customerdetails.split("_");
		
		driver.findElement(By.name("username")).sendKeys(customerInfo[0]);
		driver.findElement(By.name("password")).sendKeys(customerInfo[1]);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[@title='Calendar']")).click();
		Select select=new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText("June");
		System.out.println("june Month select from calender successfully");
		//added comment section
		
	}

}
