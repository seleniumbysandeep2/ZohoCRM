package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
public  	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() throws InterruptedException {
	
		 driver=new ChromeDriver();
	
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 Thread.sleep(4000);
	 driver.get("http://localhost/login.do");
	 Thread.sleep(2000);
	}	
	@AfterTest
	public void closeBrowser() {
	Reporter.log("closeBrowser",true);	
	driver.quit();
	}	
	@BeforeMethod
	public void login() throws InterruptedException {
	Reporter.log("login",true);	
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
	@AfterMethod
	public void logout() {
	Reporter.log("logout",true);	
	driver.findElement(By.id("logoutLink")).click();
	}
}
