package com.basictest.brosers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromelaunching {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads"D:\Chrome Driver\2.45);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\50035558\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Welcome: Mercury Tours")){
			System.out.println("correct title");
		}else{
			System.out.println("wrong title");
		}
	}

}
