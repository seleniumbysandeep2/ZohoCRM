package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPOM {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	//stores the username textbox address as @a1 in unTbx
	WebElement unTbx = driver.findElement(By.id("username"));
	//refresh and username textbox gets new address like @p1
	driver.navigate().refresh();
	//try to enter admin using old address ie @a1
	unTbx.sendKeys("admin");	
	}
}
