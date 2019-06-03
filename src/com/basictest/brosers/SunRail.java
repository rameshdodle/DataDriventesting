package com.basictest.brosers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SunRail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://10.70.157.54/ecustomer_enu/start.swe?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@title='Please enter username']")).sendKeys("donbravo");
		driver.findElement(By.xpath("//input[@title='Please enter password']")).sendKeys("Welcome123!");
		driver.findElement(By.xpath("//a[@id='LOGIN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Activate your SunCard")).click();
		}

}
