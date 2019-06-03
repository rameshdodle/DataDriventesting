package com.basictest.brosers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		String popupmsg=alert.getText();
		//System.out.println(popupmsg);
		if(popupmsg.equals("Please enter a valid user name")){
			System.out.println("Pop up message is correct");
		}
		else{
			System.out.println("Wrong pop up message");
		}
		alert.accept(); // to click on ok btn
		//Thread.sleep(4000);
		driver.close();

	}

}
