package com.basictest.brosers;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShots {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.watermark-images.com/convert-excel-to-word.aspx");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Take screenshot and store as a file format
				File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				// now copy the screenshot to desired location using copyFile //method
				FileUtils.copyFile(src, new File("D:\\TestNG\\datadriventesting\\src\\com\\basictest\\brosers\\Screenshots/google.png"));
				Thread.sleep(3000);
				driver.close();


	}

}
