package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args)  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");	
	Set<String> allWh = driver.getWindowHandles();
	int count = allWh.size();
	System.out.println(count);
	for(String wh:allWh) {
		System.out.println(wh);
	}
	
	driver.quit();

	}
}



