package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllTitle {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
	Set<String> allWh = driver.getWindowHandles();
	for(String wh:allWh) {
		driver.switchTo().window(wh);
		String title = driver.getTitle();
		System.out.println(title);
	}
	driver.quit();
	}
}



