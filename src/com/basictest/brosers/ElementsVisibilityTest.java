package com.basictest.brosers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsVisibilityTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/register/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//to check isDisplayed method
		Boolean b1=driver.findElement(By.xpath("//*[@class='myButton']")).isDisplayed();
		System.out.println(b1); //true
		
		Boolean b2=driver.findElement(By.xpath("//*[@name='first_name']")).isDisplayed();
		System.out.println(b2); //true
		
		//isEnabled
		boolean b3=driver.findElement(By.xpath("//*[@name='agreeTerms']")).isEnabled();
		System.out.println(b3); //true
		
		Boolean b4=driver.findElement(By.xpath("//*[@name='submitButton' and @id='submitButton']")).isEnabled();
		System.out.println(b4);//false
		
		
		//isSelected method
		boolean b5=driver.findElement(By.xpath("//*[@name='agreeTerms']")).isSelected();
		System.out.println(b5); //false
		
		System.out.println("************After enabiling radio button***********");
		driver.findElement(By.xpath("//*[@name='agreeTerms']")).click();
		boolean b6=driver.findElement(By.xpath("//*[@name='agreeTerms']")).isSelected();
		System.out.println(b6); //true
		
		
		driver.close();
		
		
	}

}
