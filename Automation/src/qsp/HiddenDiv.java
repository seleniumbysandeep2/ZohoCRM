package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDiv {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
	driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
	WebElement name = driver.findElement(By.id("customerName"));
	name.sendKeys("Dinga");
	driver.findElement(By.id("customerEmail")).sendKeys("Dinga@qsp");
	WebElement prod = driver.findElement(By.id("prod"));
	Select s=new Select(prod);
	s.selectByIndex(1);
	driver.findElement(By.id("message")).sendKeys("message");
	driver.findElement(By.xpath("//*[@type='submit']")).submit();
	driver.quit();
}
}
