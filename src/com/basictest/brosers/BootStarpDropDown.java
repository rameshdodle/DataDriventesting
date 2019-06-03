package com.basictest.brosers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStarpDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='TquXA']")).click();
		
		//div[@class='MocG8c B9IrJb LMgvRb' and @aria-selected='false']//content[@class='vRMGwf oJeWuf']
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='MocG8c B9IrJb LMgvRb' and @aria-selected='false']//content[@class='vRMGwf oJeWuf']"));
		System.out.println(list.size());
		for(int i=0;i<=list.size();i++){
			//System.out.println();
			System.out.println(list.get(i).getText());
		}
		
		
		
		
		
	}

}
