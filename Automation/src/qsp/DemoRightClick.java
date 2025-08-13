package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoRightClick {

	public static void main(String[] args) throws AWTException{
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
	Actions a=new Actions(driver);
	a.contextClick(link).perform();
	
	}
}
