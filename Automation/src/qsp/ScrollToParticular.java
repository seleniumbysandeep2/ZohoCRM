package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollToParticular {

	public static void main(String[] args) throws InterruptedException  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.fireflink.com/");
	JavascriptExecutor j=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	j.executeScript("window.scrollTo(*0document.body.scrollHeight)");
	Thread.sleep(3000);
	j.executeScript("window.scrollTo(0,0)");
	}
}

