package com.actitime.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoAppSPage {

	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> allCheckbox;
	
	public DemoAppSPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setAllCheckbox() throws InterruptedException {
		for(int i=0;i<allCheckbox.size();i++) {
			Thread.sleep(1000);
			allCheckbox.get(i).click();
		}
	}
	
	
}
