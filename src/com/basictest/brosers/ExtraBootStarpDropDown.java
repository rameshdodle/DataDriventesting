package com.basictest.brosers;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtraBootStarpDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://startbootstrap.com/themes/landing-pages/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle' and @id='templatesDropdown']")).click();
		//div[@class='dropdown-divider']//h6/
		//h6[contains(text(),'dropdown-header')]
		//*[contains(text(),'Template Categories:')]
		//div[@class='py-lg-3']//following-sibling::a
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='py-lg-3']//div/following-sibling::a"));
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("General Page Layouts")){
				//System.out.println();
				list.get(i).click();
				break;
			}
			//driver.close();
			
			
		}
		
	}

}
