package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectListbox {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/QSP/Desktop/Hotel.html");
WebElement mtrListBox = driver.findElement(By.id("mtr"));
	Select s=new Select(mtrListBox);
	s.selectByIndex(0);
	s.selectByValue("v");
	s.selectByVisibleText("dosa");
	Thread.sleep(1000);
	s.deselectByIndex(2);
	s.deselectByValue("d");
	s.deselectByVisibleText("idly");
System.out.println(s.isMultiple());
	}

}
