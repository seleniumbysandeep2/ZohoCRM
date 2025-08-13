package qsp;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ActitimeTabsUsingIterator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager"+Keys.ENTER);
	driver.findElement(By.xpath("//div[contains(text(),'Help')]")).click();
	driver.findElement(By.linkText("About your actiTIME")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Read License Agreement")).click();
	Set<String> allWid = driver.getWindowHandles();
	Iterator<String> i = allWid.iterator();
	String pwid = i.next();
	String cWid = i.next();
	driver.switchTo().window(cWid);Thread.sleep(2000);
List<WebElement> allHeadings = driver.findElements(By.tagName("h2"));
ListIterator<WebElement> li = allHeadings.listIterator(allHeadings.size());
while(li.hasPrevious()) {
	WebElement ele = li.previous();
	String text = ele.getText();
	System.out.println(text);
}
driver.switchTo().window(pwid);
driver.close();Thread.sleep(2000);
driver.switchTo().window(cWid).close();
}
}
