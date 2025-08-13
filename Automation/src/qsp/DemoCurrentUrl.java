package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCurrentUrl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.selenium.dev/")) {
			System.out.println("url is navigating successfully and pass");
		}
		else {
			System.out.println("url is not navigating successfully and fail");
		}
		driver.quit();
	}
}



