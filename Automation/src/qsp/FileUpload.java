package qsp;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/QSP/Desktop/naukri.html");
		File f=new File("./data/sume.pdf");
		String absPath = f.getAbsolutePath();
		Thread.sleep(2000);
		driver.findElement(By.id("resume")).sendKeys(absPath);
		System.out.println(absPath);
	}
}