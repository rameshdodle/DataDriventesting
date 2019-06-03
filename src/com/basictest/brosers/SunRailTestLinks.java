package com.basictest.brosers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SunRailTestLinks {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://10.70.157.54/ecustomer_enu/start.swe?");
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> linkElements=driver.findElements(By.tagName("a"));
		String[] linkTexts=new String[linkElements.size()];
		int i=0;
		//Fetching link texts
		for(WebElement elements:linkElements){
					//String textOfEachLink
					linkTexts[i]=elements.getText();
			i++;
			System.out.println(elements.getText());
		}
		
		 for (String t : linkTexts) {
	            driver.findElement(By.linkText(t)).click();
	            driver.navigate().back();
	            Thread.sleep(2000);
		 }
	}

}
