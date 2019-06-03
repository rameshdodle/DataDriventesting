package com.basictest.brosers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("D:\\TestNG\\datadriventesting\\src\\com\\basictest\\brosers\\newtours.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("AGE"));
		String url=prop.getProperty("URL");
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browsername.equals("FF")){
			driver=new FirefoxDriver();
		}else if(browsername.equals("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\50035558\\Downloads\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath(prop.getProperty("lastname_xapth"))).sendKeys(prop.getProperty("lastname"));
		//driver.findElement(By.xpath("lastname_xapth")).sendKeys("lastname");
	}

}
