package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignment {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	int x1 = driver.findElement(By.id("username")).getLocation().getX();
	int x2 = driver.findElement(By.name("pwd")).getLocation().getX();
	if(x1==x2) {
System.out.println("username and password textbox are properly aligned and pass");
	}
	else {
System.out.println("username and password textbox are not properly aligned and fail");
	}	
	driver.quit();
	}
}
