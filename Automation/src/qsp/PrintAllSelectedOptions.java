package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllSelectedOptions {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/QSP/Desktop/Hotel.html");
	WebElement slvListBox = driver.findElement(By.id("slv"));
	Select s=new Select(slvListBox);
	List<WebElement> allSOptions = s.getAllSelectedOptions();
	int count = allSOptions.size();
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String text = allSOptions.get(i).getText();
		System.out.println(text);
	}
	driver.quit();
	}
}
