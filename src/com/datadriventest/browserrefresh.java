package com.datadriventest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserrefresh {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("manzorr");
		driver.findElement(By.name("password")).sendKeys("manzorr");
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);

		
	}

}
