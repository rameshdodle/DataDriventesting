package com.basictest.brosers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.watermark-images.com/convert-excel-to-word.aspx");
		driver.manage().window().maximize();
		//driver
		//sendKeys("C:\\Users\\50035558\\Desktop\\Gmail - Your Myntra order item cancelled.pdf");
		driver.findElement(By.xpath("//*[@type='button' and @id='pickfiles']")).sendKeys("C:\\Users\\50035558\\Proction URL's.xlsx");
		//Thread.sleep(5000);
		//driver.close();
	}

}
