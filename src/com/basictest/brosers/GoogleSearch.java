package com.basictest.brosers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("remove");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']/li/descedant::/div[@class='sbtc']"));
		//  //ul[@role='listbox']//li/descedant:div[@class='sbl1']
		
		System.out.println("total numbe rof suggestiond in search box "+list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
			////ul[@role='listbox']/li/descedant::div[3]
		}
	}
}
