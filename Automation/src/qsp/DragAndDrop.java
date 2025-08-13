package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/");Thread.sleep(1000);
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();Thread.sleep(1000);
	WebElement webEle = driver.findElement(By.xpath("//section[text()='Web Elements']"));Thread.sleep(1000);
	Actions a=new Actions(driver);
	WebElement mouseActions = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
	a.moveToElement(webEle).perform();Thread.sleep(1000);
	a.scrollToElement(mouseActions).perform();
	mouseActions.click();
	driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();Thread.sleep(1000);
	driver.findElement(By.linkText("Drag Position")).click();Thread.sleep(1000);
	List<WebElement> draggables = driver.findElements(By.className("draggable"));
	WebElement laptop = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	WebElement mobile = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
	for (WebElement draggable : draggables) {
		String text = draggable.getText();
		if(text.contains("Mobile")) {Thread.sleep(1000);
			a.dragAndDrop(draggable, mobile).perform();
		}else if(text.contains("Laptop")) {Thread.sleep(1000);
	a.clickAndHold(draggable).moveToElement(laptop).release().perform();
		}
	}
}
}
