package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://online.actitime.com/ssandeep");
String text = driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href");
	System.out.println(text);
	driver.quit();
	}

}
