package com.datadriventest;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.Xls_Reader12;

public class DataDrivenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader12 reader=new Xls_Reader12("D:\\TestNG\\datadriventesting\\src\\com\\readingexcel\\logininput.xlsx");
		String login=reader.getCellData("logindata", "username", 2);
		System.out.println(login);
		String password=reader.getCellData("logindata", "password", 2);
		System.out.println(password);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("login")).click();
	
	}

}
