package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {

	public static void main(String[] args)  {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/QSP/Desktop/Demo.html");
driver.findElement(By.xpath("/html/body/a")).click();


	}
}
