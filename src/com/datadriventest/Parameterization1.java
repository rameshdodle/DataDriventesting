package com.datadriventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.Xls_Reader12;

public class Parameterization1 {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new FirefoxDriver();
			driver.get("http://newtours.demoaut.com/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("REGISTER")).click();
		Xls_Reader12 reader=new Xls_Reader12("D:\\TestNG\\datadriventesting\\src\\com\\readingexcel\\UserLogin.xlsx");
		int rowcount=reader.getRowCount("Sheet2");
		//System.out.println(rowcount);
		System.out.println("user account data for registration");
		System.out.println("********************************");
		for(int rowno=2;rowno<=rowcount;rowno++){
		 String firtsname1=reader.getCellData("Sheet2", "firstname", rowno); 
		 System.out.println(firtsname1);
		 String lastname1=reader.getCellData("Sheet2", "lastname", rowno); 
		 System.out.println(lastname1);
		 String phone1=reader.getCellData("Sheet2", "phone", rowno); 
		 System.out.println(phone1);
		 System.out.println("===================================");
		 
		 
		 //webdriver code
		 driver.findElement(By.name("firstName")).clear();
		driver.findElement(By.name("firstName")).sendKeys(firtsname1);
		driver.findElement(By.name("lastName")).clear();
		driver.findElement(By.name("lastName")).sendKeys(lastname1);
		driver.findElement(By.name("phone")).clear();
		driver.findElement(By.name("phone")).sendKeys(phone1);
		Thread.sleep(2000);
		
		}
		
	}
}
