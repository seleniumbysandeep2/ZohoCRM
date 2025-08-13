package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesAssignment {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/frames");
	driver.findElement(By.linkText("Nested iframe")).click();
	Thread.sleep(2000);
	WebElement fr = driver.findElement(By.xpath("//iframe[@class]"));
	driver.switchTo().frame(0);
String email = driver.findElement(By.xpath("(//p[@class='para'])[1]")).getText();
String dPW = driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
String cPW = driver.findElement(By.xpath("(//p[@class='para'])[3]")).getText();
driver.switchTo().frame(0);
Thread.sleep(1000);
driver.findElement(By.id("email")).sendKeys(email);
Thread.sleep(1000);
driver.findElement(By.id("password")).sendKeys(dPW);
Thread.sleep(1000);
driver.findElement(By.id("confirm-password")).sendKeys(cPW);
Thread.sleep(2000);
driver.findElement(By.id("submitButton")).click();
Thread.sleep(1000);
driver.switchTo().defaultContent();
boolean status=driver.findElement(By.xpath("//div[text()='Sign up successful!']")).isDisplayed();
System.out.println(status);
	}

}
