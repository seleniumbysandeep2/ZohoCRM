package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllWithoutQuit {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh) {
			driver.switchTo().window(wh);
			driver.close();
		}
	}

}
