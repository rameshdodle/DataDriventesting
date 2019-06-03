package com.basictest.brosers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleFrames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("naveenautomation");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");// we can give either int value or string value also here in frame
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		Select select=new Select(driver.findElement(By.name("cs_status")));
		select.selectByVisibleText("Inactive");
		
		Thread.sleep(2000);
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("leftpanel");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Pipeline')]")).click();
		driver.close();
	}
  

}
