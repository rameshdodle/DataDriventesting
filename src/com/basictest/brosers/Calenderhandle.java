package com.basictest.brosers;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calenderhandle {
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
		driver.findElement(By.xpath("//a[contains(text(), 'Calendar')]")).click();
		
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[7]
		
		String dateSelection="13-April-2020";
		String[] dateCalender=dateSelection.split("-");
		//System.out.println(dateCalender.toString());
		//System.out.println(dateCalender[0]);
		String day=dateCalender[0];
		String month=dateCalender[1];
		String year=dateCalender[2];
		
		Select selectMonth=new Select(driver.findElement(By.name("slctMonth")));
		selectMonth.selectByVisibleText(month);
		
		Select selectYear=new Select(driver.findElement(By.name("slctYear")));
		selectYear.selectByVisibleText(year);
		
		String beforexpath="//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterxpath="]/td[";
		final int colValue=7;
		Thread.sleep(3000);
		boolean flag=false;
		String dayValue=null;
		for(int row=2;row<=7;row++){
			for(int col=1;col<=colValue;col++){
				try{
				 dayValue=driver.findElement(By.xpath(beforexpath+row+afterxpath+col+"]")).getText();
				}
				catch(Exception e){
					System.out.println("Please select correct date from the calendar");
					flag=false;
					break;
				}
				if(dayValue.equals(day)){
					driver.findElement(By.xpath(beforexpath+row+afterxpath+col+"]")).click();
					flag=true;
					break;
					
				}
				
				
			}
			if(flag){
				break;
			}
		}
		
	}

}
