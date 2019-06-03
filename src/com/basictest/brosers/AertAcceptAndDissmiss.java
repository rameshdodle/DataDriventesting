package com.basictest.brosers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AertAcceptAndDissmiss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("submit")).click();
		Alert alert=driver.switchTo().alert();
		//
		String msg=alert.getText();
		if(msg.equals("Do you really want to delete this Customer?")){
			System.out.println("pop up msg is correct");
		}
		else{
		System.out.println("pop up msg is wrong");	
		}
		Thread.sleep(3000);
		alert.dismiss();
		
	}

}
