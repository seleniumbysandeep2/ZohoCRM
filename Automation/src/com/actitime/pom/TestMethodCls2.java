package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodCls2 {

	@Test
	public void selectAllChk() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		Thread.sleep(3000);
		DemoAppSPage s=new DemoAppSPage(driver);
		s.setAllCheckbox();		
	}	
}

