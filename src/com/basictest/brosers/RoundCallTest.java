package com.basictest.brosers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RoundCallTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("manzoor");
		driver.findElement(By.name("password")).sendKeys("manzoor");
		driver.findElement(By.name("login")).click();
		Select select=new Select(driver.findElement(By.name("fromPort")));
		List<WebElement> li=select.getOptions();
		//.cSystem.out.println(li.size());
		for(int i=0;i<=li.size();i++){
			System.out.println(li.get(i).getText());
		}
		
		
		
		/*select.selectByVisibleText("Portland");
		//select.selectByVisibleText(text);
		Thread.sleep(3000);
		Select select1=new Select(driver.findElement(By.name("fromDay")));
		//select1.selectByVisibleText("16");
		
		Thread.sleep(3000);*/
		driver.close();
	}

}
