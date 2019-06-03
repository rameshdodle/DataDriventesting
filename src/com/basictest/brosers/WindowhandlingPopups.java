package com.basictest.brosers;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlingPopups {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Good PopUp #2")).click();
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String mainWindow=it.next();
		System.out.println("main window id "+mainWindow);
		
		String childWindow=it.next();
		System.out.println("child window iid "+childWindow);
		driver.switchTo().window(childWindow);
		Thread.sleep(3000);
		System.out.println("title of child window is  ="+driver.getTitle());
		
		driver.close();
		driver.switchTo().window(mainWindow);
		System.out.println("main window title is ="+driver.getTitle());
		driver.close();
			
		
	}

}
