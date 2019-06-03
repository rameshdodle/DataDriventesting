package com.basictest.brosers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("naveenautomation");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
		//driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]
		//*[@id='vContactsForm']/table/tbody/tr[24]/td[2]/a
		
		//*[@id='vContactsForm']/table/tbody/tr[9]/td[2]/a
		
		//Method 1=>regular logic
		/*String before_xpath="//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath="]/td[2]/a";
		for(int i=4;i<=24;i++){
			//System.out.println(before_xpath +i +after_xpath);
			String name=driver.findElement(By.xpath(before_xpath +i+ after_xpath)).getText();
			System.out.println(name);
			if(name.equals("David M")){
				//*[@id='vContactsForm']/table/tbody/tr[9]/td[1]/input
				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr[" +i +"]/td[1]/input")).click();
			}
		}*/
		
		//driver.findElement(By.xpath("//a[contains(text(),'David M')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		//WebElement name=
				driver.findElement(By.xpath("//a[contains(text(),'David M')]/parent::td//following-sibling::td//a[contains(text(),'Amazon')]"));
		//System.out.println(name.getText());
		//driver.close();
				
				
                 //below are sample customizw xpaths
				//a[contains(text(),'test deal2')]/parent::td//preceding-sibling::td//a[contains(text(),'10006')]
				// in companies page==>//a[contains(text(),'AMZ')]/parent::td//preceding-sibling::td//input[@name='client_id']
		
		
		
		
		
		
	}

}
