package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args)  {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/QSP/Desktop/Page1.html");
	driver.findElement(By.id("t1")).sendKeys("a");
	driver.switchTo().frame("f1");
	driver.findElement(By.id("t2")).sendKeys("b");
	driver.switchTo().defaultContent();
	driver.findElement(By.id("t1")).sendKeys("c");
	WebElement fr = driver.findElement(By.xpath("//iframe"));
	driver.switchTo().frame(fr);
	driver.findElement(By.id("t2")).sendKeys("d");
	}
}





