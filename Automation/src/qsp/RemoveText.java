package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveText {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/QSP/Desktop/Input.html");
driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
	}
}
