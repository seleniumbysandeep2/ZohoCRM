package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.vtiger.com/");
	Thread.sleep(2000);
	WebElement target = driver.findElement(By.id("companyDropdown"));
	Actions a=new Actions(driver);
	driver.findElement(By.linkText("Contact Us")).click();
String phNo=driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
	System.out.println(phNo);
	Thread.sleep(2000);
	driver.quit();	
	}
}
